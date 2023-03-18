package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSExcecuter {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");

        WebElement username = driver.findElement(By.id("txtUsername"));
        //using JS executor, draw a box around the username
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //execute script
        //the script was from google: "js executor box script"
        js.executeScript("arguments[0].style.border='10px dotted pink'", username);
        //you can use the same logic to google the script for clicking buttons, scrolling, etc.
    }
}
