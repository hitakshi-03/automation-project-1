import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tryTest {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Predator\\Downloads\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        //1
        /*driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Meaghan Lewis");

        WebElement button = driver.findElement(By.id("button"));
        button.click(); */

        //2
       /* driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        WebElement autocompleteResult = driver.findElement(By.className("pac-container hdpi"));
        autocompleteResult.click();*/

        //3
       /* driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));
        // fullName.click();
        Actions actions =new Actions(driver);
        actions.moveToElement(fullName);
        fullName.sendKeys("Harry Potter");

        WebElement date = driver.findElement(By.id("date"));
        date.click();
        date.sendKeys("01/01/2001");*/

        //4
        /*driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        Thread.sleep(5000);

        String originalWindow = driver.getWindowHandle();  //single window
        //log.info(originalWindow);
        for(String window1: driver.getWindowHandles()) {    // multiple window
            driver.switchTo().window(window1);
        }
        Thread.sleep(5000);
        driver.switchTo().window(originalWindow);
        Thread.sleep(5000);*/

        //5
       /* driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);*/

        //6
       /* driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));
        WebElement okButton = driver.findElement(By.id("ok-button"));
        WebElement closeX = driver.findElement(By.className("close"));


        //will not work
//        Actions actions = new Actions(driver);
//        actions.moveToElement(closeButton);
//        closeButton.click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeX);

        Thread.sleep(5000);*/

        //7
       /* driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));

        WebElement box= driver.findElement(By.id("box"));
        Thread.sleep(5000);
        Actions action = new Actions(driver);
        action.dragAndDrop(image, box).build().perform();
        Thread.sleep(5000);
*/

        //8

        /*driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(3000);
        WebElement radiobutton2 = driver.findElement(By.cssSelector("input[value= 'option2']"));
        radiobutton2.click();
        Thread.sleep(3000);
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(3000);
         */

        //9

        /*driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        Thread.sleep(2000);
        //checkbox1.click();

        WebElement checkbox2 = driver.findElement((By.cssSelector("input[value='checkbox-2']")));
        checkbox2.click();
        Thread.sleep(2000);

        WebElement checkbox3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        checkbox3.click();
        Thread.sleep(2000);*/

        //10
        /*driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("01/01/2001");
        dateField.sendKeys(Keys.RETURN);
        Thread.sleep(2000);*/

        //11
      /*  driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownButton.click();
        Thread.sleep(2000);
        WebElement autoCompleteItem = driver.findElement(By.id("autocomplete"));
        autoCompleteItem.click();
        Thread.sleep(2000);*/

        //12
        /*driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("Predator_Wallpaper_01_3840x2400.png");
        Thread.sleep(2000);

        WebElement resetButton = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
        resetButton.click();
        Thread.sleep(2000); */

        driver.quit();

    }

}
