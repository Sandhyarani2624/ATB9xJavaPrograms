package ex_11112024OOPs_Encap_AM.RealExample;

public class TestCase1 extends BaseClass{

    public TestCase1(){
        super(); //Parent Constructor - Super(Keyword) - Means Parent
        System.out.println("DC-TC1");
    }


    public void startTestCase(){
        openBrowser("chrome");
        closeBrowser();
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }
}
