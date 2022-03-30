package tests;

import lombok.extern.log4j.Log4j;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Log4j
public class SimpleTestClassOne {


    @Test
    @Parameters({"metadataCode", "pipelineName"})
    public void simpleTest2(String metadataCode, String pipelineName) {
        System.out.println("metadataCode " + metadataCode);
        System.out.println("pipelineName " + pipelineName);
    }

}
