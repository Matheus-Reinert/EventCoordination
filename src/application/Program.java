package application;

import model.entities.CoffeeSpace;
import model.entities.EventClass;
import model.util.CoffeeSpaceRegister;
import model.util.EventClassRegister;
import model.util.PeopleRegister;

import java.util.Scanner;

public class Program {

    public static int mainMenu() {

        System.out.println("\n-----MAIN MENU-----");
        System.out.println("1 - People menu");
        System.out.println("2 - Event class menu");
        System.out.println("3 - Coffee space menu");
        System.out.println("0 - Exit");
        System.out.print("Enter an option: ");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }

    public static void main(String[] args) {

        System.out.println("------- JAVA EVENT ------");

        System.out.println(" ");

        PeopleRegister people = new PeopleRegister();
        EventClassRegister event = new EventClassRegister();
        CoffeeSpaceRegister coffee = new CoffeeSpaceRegister();

        int opc = mainMenu();

        while(opc != 0) {

            switch (opc) {
                case 1:
                    people.menuPeople();
                    break;
                case 2:
                     event.menuClass();
                    break;
                case 3:
                    coffee.menuCoffee();
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }
            opc = mainMenu();
        }

    }

}


