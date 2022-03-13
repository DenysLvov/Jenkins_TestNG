package tests;

import lombok.extern.log4j.Log4j;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Log4j
public class SimpleTestClassTwo {

    @Parameters({"num"})
    @Test
    public void simpleTest1(int num) {
        log.info("Test " + num);
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
