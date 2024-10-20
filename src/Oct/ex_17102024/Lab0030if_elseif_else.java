package Oct.ex_17102024;
import java.util.Scanner;
public class Lab0030if_elseif_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        if(num1>num2)
        {
            System.out.println("num1");
        }
        else if(num2>num1)
        {
            System.out.println("num2");
        }
        else
        {
            System.out.println("Equal");
        }
        sc.close();
    }
}
