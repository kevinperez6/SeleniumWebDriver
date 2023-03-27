package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BroserProperties {
    public static void main(String[] args) {
        /*_____________________________________________*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //INITIALIZE THE WEBDRIVER
        WebDriver driver = new ChromeDriver(options);
        //WebDriver Chrome
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");
        /*_____________________________________________*/

        driver.get("https:\\www.wikipedia.com");
        //GET TITLE
        String titulo = driver.getTitle();
        System.out.println("Titulo de la pagina: " + titulo);

        driver.close();

    }
}
