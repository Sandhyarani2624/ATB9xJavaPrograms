package Oct.ex_18102024;
import java.util.Scanner;
public class Lab0033Switch_browser {
    //I will ask user that in which browser you wants to me to run the code.
    //chrome/firefox/edge
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = sc.next();
        browser = browser.toLowerCase();
        switch(browser){
            case "chrome":
                System.out.println("Chrome is starting....");
                break;
            case "Fozilla":
                System.out.println("Fozilla is starting...");
                break;
            case "edge":
                System.out.println("edge is starting");
                break;
            default:
                System.out.println("No idea");
                break;
        }
            sc.close();
    }

}
