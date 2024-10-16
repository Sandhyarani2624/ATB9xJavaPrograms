package Oct.ex_16102024;

import java.util.Scanner;

public class Lab0021takeinputScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age = scanner.nextInt();
        System.out.println(age>25 ? "Allowed to Goa" : " Not allowed to Goa");
        scanner.close();
    }
}
