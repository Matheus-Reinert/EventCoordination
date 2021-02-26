package application;

import model.util.PeopleRegister;

import java.util.Scanner;

public class Program {

    public static int mainMenu() {

        System.out.println(" Main menu");
        System.out.println("1 - People menu");
        System.out.println("2 - Event class menu");
        System.out.println("3 - Coffee space menu");
        System.out.println("0 - Exit");

        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }

    public static void main(String[] args) {

        System.out.println(" JAVA EVENT ");

        System.out.println(" ");

        PeopleRegister people = new PeopleRegister();

        int opc = mainMenu();

        while(opc != 0) {

            switch (opc) {
                case 1:
                    people.peopleMenu();
                    break;
                case 2:
                   // event.menuCliente();
                    break;
                case 3:
                 //   coffee.menuVendas();
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }
            opc = mainMenu();
        }

    }

}


