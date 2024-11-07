package ex_06112024OOPsConstructor;

public class Lab0084_P_Constructor {
    public static void main(String[] args) {
        Car2 t1 = new Car2("tesla", 2015);
        System.out.println(t1.model);
        System.out.println(t1.year);
    }

    static class Car2 {
        String model;
        int year;

        //Parameterized Constructor
        Car2(String model, int year_created) {
            System.out.println("PC");
            this.model = model;
            this.year = year_created;
        }
    }
}

