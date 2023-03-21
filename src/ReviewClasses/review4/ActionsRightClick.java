package ReviewClasses.review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsRightClick {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions actions = new Actions(driver);

        WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));

        actions.contextClick(rc).perform();
    }
}
