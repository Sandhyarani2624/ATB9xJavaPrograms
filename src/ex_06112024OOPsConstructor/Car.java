package ex_06112024OOPsConstructor;

public class Car {
    String model;
    int year;
    String name;

    //Default Constructor
    Car(){ //no arguments
        name = "Unknown Name";
        model = "XYZ";
        year = 0;
        System.out.println("DC");
    }
}
