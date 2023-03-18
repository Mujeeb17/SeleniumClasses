package class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenshotDemo {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester", Keys.TAB);

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test",Keys.ENTER);

        //declare an instance
        TakesScreenshot ss = (TakesScreenshot) driver;
        //takes the screenshot as a file
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        //save the file on this computer
        FileUtils.copyFile(sourceFile, new File("C:/Users/mujee/Coding Projects/SeleniumBatch15/src/Screenshot/abc.png"));
        //when this code ran, we created a new folder inside this project called Screenshot and stored it in there
    }
}
