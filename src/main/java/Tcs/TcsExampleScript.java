package Tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TcsExampleScript {
    //Searching for "Fresco Play" in Google search
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Fresco Play");



        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);



        //Thread.sleep(5000);
        System.out.println("Page Title : " + driver.getTitle());

//Click "Fresco Apps" link from the search list



        driver.findElement(By.xpath("//*[@id='rso']/div/div/div[2]/div/div/h3/a")).click();



        //Thread.sleep(5000);
        System.out.println("Page Title : " + driver.getTitle());



        driver.quit();
    }
}

