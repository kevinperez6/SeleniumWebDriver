package Tcs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tcs {
    public static void main(String[] args) {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);

        driver.get("https://www.google.com");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Fresco play");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        System.out.println("Page Tittle: " + driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3")).click();
        System.out.println("Page Tittle: " + driver.getTitle());

            //driver.close();
    }
}
