package ex_11112024OOPs_Encap_AM.RealExample;

public class BaseClass {  // 1-Baseclass will be used by everyone

    private String browser; //2-Instance variable will be created, as per the encap its should be private, which will be used by gettersetter

    BaseClass(){ //3-Default Constructor
        System.out.println("DC-BaseClass");
    }

    BaseClass(String b){  //Parameteraised Constructor
        System.out.println("PC-BaseClass");
    }

    public String getBrowser() { // getterSetter
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }
  //4 - Method Overloading - Same name but different arguments
    void openBrowser(){
        System.out.println("Opening Browser");
    }

    void openBrowser(String browserName){
        System.out.println("Open Browser->"  +browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser");
    }
}
