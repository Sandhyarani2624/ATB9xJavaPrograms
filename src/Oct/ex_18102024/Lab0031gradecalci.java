package Oct.ex_18102024;
import java.util.Scanner;
public class Lab0031gradecalci {
    public static void main(String[] args){
        //write a program that calculates and displays the letter grade for given numerical score based on the
        //following grading scale:

        //A = 90 to 100
        //B = 80 to 89
        //C = 70 to 79
        //D = 60 to 69
        //F = 0 to 59

        // Logic building - Java

        // Step 1
        //Find the inputs/Outputs
        //Input - score -> (0-100)->Datatype->int
        //Output - Grade -> Datatype-> Char

        //Basic logic
        //if(score>=90 && score<=100) -> print grade --> A
        //elseif(score>=80 && score<=89) -> print grade --> B
        //elseif(score>=70 && score<=79) -> print grade --> C
        //elseif(score>=60 && score<=69) -> print grade --> D, E
        //else -> print grade --> F

        //Write logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score");
        int score = sc.nextInt();
        char grade = 'F';

        if (score>=90 && score<=100)
        {
            grade = 'A';
        }
        else if(score>=80 && score<=89)
        {
            grade = 'B';
        }
        else if(score>=70 && score<=79)
        {
            grade = 'C';
        }
        else if(score>=60 && score<=69)
        {
            grade = 'D';
        }
        else if(score<=0 || score>100)
        {
            System.out.println("LOL");
            grade = 'O';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("You grade is: " +grade);

        sc.close();
    }
}

