package Oct.ex_16102024;

import java.util.Scanner;

public class Lab0023userinput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Taking user input
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        System.out.println("Enter the salary: ");
        Double salary = scanner.nextDouble();

        //Print user inputs
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);

        scanner.close();
    }
}

