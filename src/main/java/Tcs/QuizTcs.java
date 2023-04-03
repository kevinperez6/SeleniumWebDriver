package Tcs;

import org.testng.annotations.Test;

import java.lang.reflect.Executable;
/**
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
<<<<<<< HEAD
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
//import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import io.github.bonigarcia.wdm.ChromeDriverManager;
public class QuizTcs {

            public WebDriver driver;

            @BeforeTest

            @Parameters("browser")
            public void SelectBrowser(String browser)
            {

                // Write your script here
                if(browser.equalsIgnoreCase("ChromeHeadless")){
                    System.setProperty("webriver.drover.chrome","projects/challenge/chromediver");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--no-sandbox","--headless","--disable-gpu","--disable-dev-shm-usage");
                    driver = new ChromeDriver(chromeOptions);
                    System.out.println("Chrome Headless launched");
                }
                else if(browser.equalsIgnoreCase("PhantomJS")){
                    DesiredCapabilities caps = new DesiredCapabilities();
                    caps.setJavascriptEnabled(true);
                    caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/projects/challenge/phantomjs-2.1.1-linux-x86_64/bin/phantomjs");
                    driver = new PhantomJSDriver(caps);
                    System.out.println("PhantomJS Headless Driver Launched");
                }

                driver.manage().window().maximize();
                driver.get("https://www.google.com");
            }

            @Test
            public void GoogleSreach() throws InterruptedException{

                // Searching for "Fresco Play" in Google search.
                // Find the elementlocators for the below actions.
                // 1) Find locator for Google Search Box and sendkeys as Fresco Play as below.
                driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Fresco Play");

                // 2) Find locator for Google Search Box and sendkeys as Enter  as below.
                driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).sendKeys(Keys.ENTER);
                Thread.sleep(6000);
                System.out.println("Page Title : " + driver.getTitle());


            }

            @AfterTest
            public void BroswerQuit(){
                driver.quit();
            }

=======
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.ChromeDriverManager;
public class QuizTcs {


        public WebDriver driver;

        @BeforeTest

        @Parameters("browser")
        public void SelectBrowser(String browser)
        {

            // Write your script here

            if(browser.equalsIgnoreCase("ChromeHeadless")){
                System.setProperty("webriver.drover.chrome","projects/challenge/chromediver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox","--headless","--disable-gpu","--disable-dev-shm-usage");
                driver = new ChromeDriver(chromeOptions);
            }

            else if(browser.equalsIgnoreCase("PhantomJS")){
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setJavascriptEnabled(true);
                caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"/projects/challenge/phantomjs-2.1.1.1-linuxx86_64/bin/phantomjs");
                driver = new PhantomJSDriver(caps);
                System.out.println("PhantomJS Headless Driver launched");
            }{{execute}};
>>>>>>> origin/main
        }



<<<<<<< HEAD
    }

}
=======


        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void GoogleSreach() throws InterruptedException{

        // Searching for "Fresco Play" in Google search.
        // Find the elementlocators for the below actions.
        // 1) Find locator for Google Search Box and sendkeys as Fresco Play as below.
        driver.findElement(By.xpath("")).sendKeys("Fresco Play");

        // 2) Find locator for Google Search Box and sendkeys as Enter  as below.
        driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        System.out.println("Page Title : " + driver.getTitle());


    }

    @AfterTest
    public void BroswerQuit(){
        driver.quit();
    }

}

}
>>>>>>> origin/main
**/