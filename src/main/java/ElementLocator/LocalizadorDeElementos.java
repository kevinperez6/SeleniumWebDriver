package ElementLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocalizadorDeElementos {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://fccmontevideo.com/blog/desafia-tus-habilidades");
        System.out.println("Titulo de la pagina:" + driver.getTitle());
        WebElement home = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/nav/div[1]/div/div[2]/div[2]/a[1]"));
        home.click();
        //WebElement group = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/main/div[3]/div/main/div/div[2]/a"));
        WebElement group = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div[1]/div[2]/main/div/div/div/a"));
        //driver.close();

    }
}
