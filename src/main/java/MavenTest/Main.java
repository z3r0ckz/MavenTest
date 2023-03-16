package MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {

        //Setup Language EN
        ChromeOptions options = new ChromeOptions();
        options.addArguments("lang=en-GB");
        //To fix problems with the versions
        options.addArguments("--remote-allow-origins=*");

        //1 Step  ---- Open the Chrome Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeroc\\Documents\\ModulosJava\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //Navigate to the URL
        driver.get("https://store.steampowered.com/");
        System.out.println(driver.getCurrentUrl());

        //Credentials
        String username ="";
        String password ="";
        WebElement usernameInput = driver.findElement(By.id(""));
        WebElement passwordInput = driver.findElement(By.id(""));
        WebElement loginbtn = driver.findElement(By.id(""));

        //Login
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbtn.click();

    }
}