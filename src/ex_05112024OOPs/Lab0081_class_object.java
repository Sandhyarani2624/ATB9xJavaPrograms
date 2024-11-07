package ex_05112024OOPs;

public class Lab0081_class_object {
    public static void main(String[] args){
        StudentsATB s1 = new StudentsATB(); //Memory got allocated
        //StudentsATB -> Class Loading(Class loader will load the class)
        //s1 -> Object reference
        //new StudentsATB(); -> Object Creation
        s1.name = "Sandhya"; //Attribute
        s1.eat(20); // Behaviour
    }
}// It is a running class
