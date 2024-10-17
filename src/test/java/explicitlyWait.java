import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Wait for certain amount of time for a specific condition to be true
public class explicitlyWait {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Predator\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        WebElement checkbox1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox-1")));
        checkbox1.click();


//        Thread.sleep(2000);
        //checkbox1.click();

        WebElement checkbox2 = driver.findElement((By.cssSelector("input[value='checkbox-2']")));
        checkbox2.click();
//        Thread.sleep(2000);

        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        checkbox3.click();
//        Thread.sleep(2000);

        driver.quit();
    }
}
