package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestClassOne {


    @Parameters({"num"})
    @Test
    public void simpleTest1(int num) {
        System.out.println("Test " + num);
    }

    @Test
    @Parameters("num")
    public void simpleTest2(int num) {
        System.out.println("Test " + num);
    }

    @Test
    @Parameters("num")
    public void simpleTest3(int num) {
        System.out.println("Test " + num);
    }
}
