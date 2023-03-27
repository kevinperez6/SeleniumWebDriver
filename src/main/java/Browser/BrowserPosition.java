package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserPosition {
    public static void main(String[] args) {
        /*_____________________________________________*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //INITIALIZE THE WEBDRIVER
        WebDriver driver = new ChromeDriver(options);
        //WebDriver Chrome
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");
        /*_____________________________________________*/

        //Position Window BUSCAR VIDEOS RELACIONADOS CON EL POSICIONAMIENTO DEL BROWSER
        //options.addArguments("--windows-position=1050,750");
        driver.get("https://www.wikipedia.org");
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.close();
        //BROWSER POSITION

    }
}
