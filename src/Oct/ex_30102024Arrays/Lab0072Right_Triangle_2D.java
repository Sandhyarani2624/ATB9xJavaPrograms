package Oct.ex_30102024Arrays;
import java.util.Scanner;
public class Lab0072Right_Triangle_2D {
    public static void main(String[] args) {
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}