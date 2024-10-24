package Oct.ex_23102024functions;

public class Lab0056userdefinedfunctions {
    public static void main(String[] args) {
        //Types of User defined functions

        //1- Without parameters and without return type.
        greet();

        //2- Without parameters and with return type.
        String returned_value= greet_with_hello();
        System.out.println(returned_value);

        //3- With parameters and without return type.
        greet_with_name("Sandhya");

        //4- With parameters and with return type.
        int result = sum_of_two_number(3, 4);
        System.out.println(result);

    }

    //1- Without parameters and without return type.
    static void greet(){
        System.out.println("Hi");
    }

    //2- Without parameters and with return type.
    static String greet_with_hello(){
        System.out.println("Hi, I am type2");
        return "Hi, how are you?";
    }
    //3- With parameters and without return type.
    static void greet_with_name(String name){
        System.out.println("Your name is->" +name);
    }
    //4- With parameters and with return type.
    static int sum_of_two_number(int a, int b){
        return a + b;
    }
}
