package Oct.ex_18102024;
import java.util.Scanner;
public class Lab0032SwitchStatement {
    //Enter the number from 1-7, will tell which day it is.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1-7");
        int num = sc.nextInt();

        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea");
                break;
        }
        System.out.println("End of the Loop");
        sc.close();
    }
}
