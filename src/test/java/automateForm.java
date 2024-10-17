import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class automateForm {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Predator\\Downloads\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Tony");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Stark");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("SuperHero");

        WebElement education = driver.findElement(By.id("radio-button-2"));
        education.click();

        WebElement gender = driver.findElement(By.id("checkbox-1"));
        gender.click();

        WebElement experience = driver.findElement(By.id("select-menu"));
        experience.click();
        WebElement option = driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[5]"));
        option.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("17/10/2024");
        date.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submitButton.click();

        // assertion
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
//        Thread.sleep(10000);
//        WebElement alert = driver.findElement(By.className("alert"));

        String alertText = alert.getText();


        assertEquals("The form was successfully submitted!", alertText);

        driver.quit();

    }
}
