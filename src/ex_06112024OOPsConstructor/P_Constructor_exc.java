package ex_06112024OOPsConstructor;
import java.util.Scanner;
public class P_Constructor_exc {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model name");
        String model = sc.next();
        System.out.println("Enter the year ");
        int year = sc.nextInt();

        Car3 t3 = new Car3(model, year);

        System.out.println(t3.model);
        System.out.println(t3.year);

        t3.display();
    }

    static class Car3 {
        String model;
        int year;

        //Parameterized Constructor
        Car3(String model, int year) {
            System.out.println("PC");
            this.model = model;
           this.year = year;
        }

        void display(){
            System.out.println("Car3 details= " + this.model + "-" + this.year);
        }
    }
}


