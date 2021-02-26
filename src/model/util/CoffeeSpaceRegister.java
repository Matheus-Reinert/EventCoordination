package model.util;

import model.entities.CoffeeSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeSpaceRegister {

    public static List<CoffeeSpace> coffeeSpaces = new ArrayList<>();

    public CoffeeSpaceRegister(){
    }

    public int menu() {

        System.out.println("\n-----Event coffee Menu------");
        System.out.println("1 - Register coffee");
        System.out.println("2 - Coffee list");
        System.out.println("0 - Exit");
        System.out.print("Enter an option: ");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    public void menuCoffee() {

        int opc = menu();

        while (opc != 0) {
            switch (opc) {
                case 1 -> {
                    System.out.println("Register class");
                    registerCoffee();
                    opc = menu();
                }
                case 2 -> {
                    System.out.println("Show classes");
                    listCoffees();
                    opc = menu();
                }
                default -> System.out.println("Error");
            }
        }

    }

    public void registerCoffee() {

        Scanner sc = new Scanner(System.in);
            System.out.println("\nDo you want to use 1 or 2 coffee spaces? ");
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sc.nextLine();

            if(n > 2){
                System.out.println("We dont have more than 2 coffee space");
                return;
            }

            for (int i = 0; i < n; i++) {

                System.out.print("Name coffee space: ");
                String nameCoffee = sc.nextLine();
                System.out.print("Capacity: ");
                Integer capacity = sc.nextInt();

                new CoffeeSpace(nameCoffee, capacity);
                System.out.println("coffee class successfully\n");
            }
    }

    public CoffeeSpace findCoffee(String name) {
        for (CoffeeSpace coffeeSpace : coffeeSpaces) {
            if (coffeeSpace != null && coffeeSpace.getName() == name) {
                return coffeeSpace;
            }
        }
        System.out.println("Class not found");
        return null;
    }

    public void listCoffees() {
        if (coffeeSpaces.isEmpty())
            System.out.println("There are no classes create");
        else
            for (CoffeeSpace coffeeSpace : coffeeSpaces) {

                System.out.println("\nName: " + coffeeSpace.getName());
                System.out.println("Capacity: " + coffeeSpace.getCapacity() + "\n");

            }
    }







}



