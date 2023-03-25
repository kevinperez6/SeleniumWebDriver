package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
    public static void main(String[] args) {
        /*_____________________________________________*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        /*_____________________________________________*/

        //Inicialize browser
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");

        //OPEN PAGE
        driver.get("http://www.facebook.com");

        //MAXIMIZE BROWSER
        driver.manage().window().maximize();
        driver.close();

    }
}
