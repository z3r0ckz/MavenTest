package MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class Waits {
    public static void main(String [] args) throws InterruptedException {

        String url = "";

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeroc\\Documents\\ModulosJava\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Explicit Wait espera hasta que aparezca
        //WebDriverWait wait = new WebDriverWait(driver, 6);
        driver.get(url);

        try{
            //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("")));
            WebElement button = driver.findElement(By.id(""));
            button.click();

        }catch(Exception e){
            //  Se imprime la Exception
            System.out.println(e);
        }

    }

}
