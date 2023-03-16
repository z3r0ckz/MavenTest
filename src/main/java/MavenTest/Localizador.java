package MavenTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.Assert;
public class Localizador {
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }
    @Test void locator(){
        By locator = By.id("");
        By locator_TagName = By.tagName("");
        By locator_linktext =By.linkText("");
        By locator_PartialLinkText = By.partialLinkText("");
        By locator_cssSelector = By.cssSelector("");
        By locator_Xpath = By.xpath("");
        //Javascript
        JavascriptExecutor js = (JavascriptExecutor)  driver;
        WebElement searchBox = (WebElement) js.executeScript("return document.getElementsByName('q'[0]");

    }
}
