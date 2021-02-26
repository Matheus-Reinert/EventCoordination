package model.util;

import model.entities.EventClass;

import java.util.ArrayList;
import java.util.Scanner;

public class EventClassRegister {

    public EventClassRegister() {

    }

    public static ArrayList<EventClass> eventClasses = new ArrayList<>();

    public int menu() {

        System.out.println("-----Event classes Menu-----");
        System.out.println("1 - Register class");
        System.out.println("2 - Class list");
        System.out.println("0 -  Exit");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public void menuClass() {

        int opc = menu();

        while (opc != 0) {
            switch (opc) {
                case 1 -> {
                    System.out.println("Register class");
                    registerClass();
                    opc = menu();
                }
                case 2 -> {
                    System.out.println("Show classes");
                    listClasses();
                    opc = menu();
                }
                default -> System.out.println("Error");
            }
        }

    }

    public void registerClass() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nHow many classes do you want to create?");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Name class: ");
            String nameClass = sc.nextLine();
            System.out.print("Capacity: ");
            Integer capacity = sc.nextInt();

            eventClasses.add(new EventClass(nameClass, capacity));
            System.out.println("class create successfully\n");
        }
    }

    public EventClass findClass(String name) {
        for (EventClass eventClass : eventClasses) {
            if (eventClass != null && eventClass.getName() == name) {
                return eventClass;
            }
        }
        System.out.println("Class not found");
        return null;
    }

    public void listClasses() {
        if (eventClasses.isEmpty())
            System.out.println("There are no classes create");
        else
            for (EventClass eventClass : eventClasses) {

                System.out.println("\nName: " + eventClass.getName());
                System.out.println("Capacity: " + eventClass.getCapacity() + "\n");

            }
    }
}
