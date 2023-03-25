package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
    public static void main(String[] args) {
        /*_____________________________________________*/
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //INITIALIZE THE WEBDRIVER
        WebDriver driver = new ChromeDriver(options);
        /*_____________________________________________*/
        //WebDriver Chrome
        System.setProperty("webdriver.chrome.driver","E:\\Programas\\Programas Selenium Web Driver\\chromedriver.exe");
        //initialize Browser
        driver.get("https://www.saucedemo.com/");
        //Maximize browser
        driver.manage().window().maximize();

        //CREDENTIALS
        /*----------------------------------------------*/
        String username = "standard_user";
        String password = "secret_sauce";
        /*---------------------------------------------*/

        //Locator by ID
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton   = driver.findElement(By.id("login-button"));

        //locator by Class
        //WebElement usernameInput2 = driver.findElement(By.className("input_error"));
        //WebElement passwordInput2 = driver.findElement(By.className("form_input"));
        //WebElement loginButton2   = driver.findElement(By.className("submit-button"));

        //locator by Name
        //WebElement usernameInput3 = driver.findElement(By.name("user-name"));
        //WebElement passwordInput3 = driver.findElement(By.name("password"));
        //WebElement loginButton3   = driver.findElement(By.name("login-button"));

        //locator by Xpath
        //WebElement usernameInput4 = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        //WebElement passwordInput4 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        //WebElement loginButton4   = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        //Locator by Css
        //WebElement usernameInput5 = driver.findElement(By.cssSelector(".error"));


        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        //Exit
        //driver.close();
    }

}
