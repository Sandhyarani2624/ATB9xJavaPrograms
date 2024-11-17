package ex_11112024OOPs_Encap_AM.RealExample;

public class TestCase1 extends BaseClass{ //5-Single inheritance

    public TestCase1(){
        super(); //6- To call the Parent Constructor in future - Super(Keyword) - Means Parent
        System.out.println("DC-TC1");
    }


    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }
//7 - method overriding
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }


}

