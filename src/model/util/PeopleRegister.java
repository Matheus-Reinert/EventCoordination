package model.util;

import model.entities.People;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleRegister {

    public static ArrayList<People> peopleList = new ArrayList<>();

    public PeopleRegister() {
    }

    private int menu() {
        System.out.println("\nPEOPLE MENU");
        System.out.println("1 - People register");
        System.out.println("2 - Show People");
        System.out.println("0 - Exit");
        System.out.print("Enter an option: ");

        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void menuPeople() {

        int opc = menu();

        while (opc != 0) {
            switch (opc) {
                case 1 -> {
                    System.out.println("\nPeople register");
                    peopleRegister();
                    opc = menu();
                }
                case 2 -> {
                    System.out.println("Find Someone");
                    peopleList();
                    opc = menu();
                }
                default -> System.out.println("Error");
            }
        }
    }

    private static void peopleRegister() {

        People people = new People();

        Scanner sc = new Scanner(System.in);

        System.out.println("How many people?");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Surname: ");
            String surname = sc.nextLine();


            peopleList.add(new People(name, surname));
        }

        System.out.println("People register successfully");

    }

    public static void peopleList() {


        if (peopleList.isEmpty()) {
            System.out.println("Don't have register");
        } else
            for (People p : peopleList) {

                System.out.println("Name: " + p.getName());
                System.out.println("Surname: " + p.getSurname() + "\n");

            }
    }

    public People showPeople(String name, String surname) {
        Scanner sc = new Scanner(System.in);

        for (People p : peopleList) {
            if (p != null && p.getName().equalsIgnoreCase(name) && p.getSurname().equalsIgnoreCase(surname)) {

                System.out.print("Enter name: ");
                String nameCompare = sc.nextLine();
                System.out.print("Enter surname: ");
                String surnameCompare = sc.nextLine();

                if (nameCompare.equals(p.getName()) && surnameCompare.equals(p.getSurname())) {

                    return p;
                } else {
                    System.out.println("Person not found");
                }

            } else
                System.out.println("Person not found");
        }

        return null;
    }



}
