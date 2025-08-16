package Udemy.Code.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {
    public static void main(String[] args) {
        method2();

        System.out.println("End of program");

    }

    public static void method1() {
        System.out.println("Start Method 1");
        
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Values the vector:");
            String vector[] = scanner.nextLine().split("  ");
            System.out.println("Position: ");

            int position = scanner.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException exception1) {
            System.out.println("Invalid position!");
            exception1.printStackTrace();

            
        } catch (InputMismatchException exception2) {
            System.out.println("Input error!");
        }
        finally{
            scanner.close();
            System.out.println("End Method 1");

        }
       

    }


    public static void method2(){
        System.out.println("Start Method 2");

        method1();
        System.out.println("End Method 2");
    }
}
