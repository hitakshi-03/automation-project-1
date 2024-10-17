import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
//Wait for specified amount of time before throwing a no such element exception
public class implicitWait {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Predator\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        //checkbox1.click();

        WebElement checkbox2 = driver.findElement((By.cssSelector("input[value='checkbox-2']")));
        checkbox2.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        Thread.sleep(2000);

        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        checkbox3.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        driver.quit();

    }
}
