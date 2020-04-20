package az.stepit.exceptions;

import java.util.Scanner;

public class MyExceptionDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter please number: ");
        String input = scanner.nextLine();
        try{
            int num = Integer.parseInt(input);
        }catch (NumberFormatException ex){
            throw new MyException("Your input type is not a number", "RS:001");
        }


    }
}
