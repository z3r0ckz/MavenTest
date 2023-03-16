package MavenTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.Assert;
public class TestNG {
    private final String url = ("https://demoqa.com/");
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @BeforeTest
    public void setBaseUrl(){
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\zeroc\\Documents\\ModulosJava\\chromedriver.exe");
        driver.get(url);
    }

    @Test
    public void  titleTest(){
        String expectedTitle = "DEMOQA";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void urlTest(){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, url);

    }

    @AfterTest
    public void closeSession(){
        driver.quit();
    }

}
