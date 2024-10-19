package Oct.ex_17102024;
import java.util.Scanner;
public class Lab0026ifelse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not allowed to vote");
        }
    }
}
