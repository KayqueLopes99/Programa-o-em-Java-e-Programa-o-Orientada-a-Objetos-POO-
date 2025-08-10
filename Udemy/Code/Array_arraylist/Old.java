package Udemy.Code.Array_arraylist;
import java.util.Scanner;

public class Old {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int quantity;
        while (true) {
            System.out.print("Enter the quantity of persons not negative: ");
            quantity = scanner.nextInt();
            if (quantity > 0) {
                break;
            }
        }
        Person vector[] = new Person[quantity];
        int biggerAge = 0;

        

        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(" ---> Person n" + (i + 1) + ": <---");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            
            vector[i] = new Person(name, age);

            if (biggerAge < vector[i].getAge()) {
                biggerAge = vector[i].getAge();
            }
        }


        System.out.println("Person very old:");
        for (int i = 0; i < vector.length; i++) {
            if(biggerAge == vector[i].getAge()){
                System.out.println("Nome: " + vector[i].getName() + " Idade: " + vector[i].getAge());

            }
        }

       
    

        scanner.close();
    }
}

