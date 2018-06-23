package common;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.ITestContext;
import org.testng.annotations.*;

public class BaseTest {

    RequestSpecification rspec;
    RequestSpecBuilder build;

    @BeforeSuite
    public void beforeSuite(ITestContext iSuite){
        System.out.println("Before Suite" +iSuite.getCurrentXmlTest().getSuite().getName());
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
