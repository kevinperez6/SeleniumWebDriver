package TestNG;

import org.testng.annotations.*;

public class TestGN {

    @Test
    public void testCase1(){
        System.out.println("Este es el 1 testcase");
    }
    @Test
    public void testCase2(){
        System.out.println("Este es el 2 testCase");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("antes de cada método");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Despues de cada método");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Antes de cada clase");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Despues de cada clase");
    }

    @BeforeSuite
     public void beforeSuite(){
        System.out.println("Antes de las pruebas de este conjunto");
    }

    }
