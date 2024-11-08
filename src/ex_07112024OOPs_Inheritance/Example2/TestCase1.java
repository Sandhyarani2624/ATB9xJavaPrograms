package ex_07112024OOPs_Inheritance.Example2;

public class TestCase1 extends Common_BaseTest {
    TestCase1(){
        System.out.println("DC-Child");
    }

    void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }

}
