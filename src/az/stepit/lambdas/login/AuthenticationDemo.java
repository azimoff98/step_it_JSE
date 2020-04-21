package az.stepit.lambdas.login;

import java.util.Scanner;

import static az.stepit.lambdas.login.AuthenticationService.*;

public class AuthenticationDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1 for facebook or 2 for google authentication");
        int selected = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);

        if(selected == 1){
            System.out.println("You have chosen facebook authentication");
            System.out.print("Enter your username: ");
            String username = scanner1.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner1.nextLine();

            fbAuth(username, password);
        }
        if(selected == 2){
            System.out.println("You have chosen google authentication");
            System.out.print("Enter your username: ");
            String username = scanner1.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner1.nextLine();

            googleAuth(username, password);
        }


    }
}
