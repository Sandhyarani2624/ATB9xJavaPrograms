package Oct.ex_16102024;

import java.util.Scanner;

public class Lab0022scanner_practice {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age = scanner.nextInt();
        System.out.println(age>18 ? "Allowed" : "Not allowed");
        scanner.close();

    }
}
