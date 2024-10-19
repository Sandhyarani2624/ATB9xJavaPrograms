package Oct.ex_17102024;
import java.util.Scanner;
public class Lab0029oddeven_program {
    public static void main(String[] args){
        // check the odd/even numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, will tell you wheather its odd or even");
        int num = sc.nextInt();

        //Using modulus to check odd or even
        //num/2 -> 0 -> Even
        //num/2 -> 1 -> Odd
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

        sc.close();
    }
}
