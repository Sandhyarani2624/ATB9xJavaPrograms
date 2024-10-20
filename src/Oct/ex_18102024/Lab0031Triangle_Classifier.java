package Oct.ex_18102024;
import java.util.Scanner;
public class Lab0031Triangle_Classifier {
    //Triangle classifier
    //Write a program that classifies the triangle based on the side lengths.

    //Step1
    //Find the inputs
    //Inputs-->side1, side2, side3-->Datatype-->double
    //Outputs-->Equilateral, Isosceles, Scalene-->Datatype-->string
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the side2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the side3: ");
        double side3 = sc.nextDouble();

        if(side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("Invalid, side must be positive");
        }
        else if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("Triangle is Equilateral");
        }
        else if(side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("Triangle is Isosceles");
        }
        else
        {
            System.out.println("Triangle is Scalene");
        }

        sc.close();
    }
}
