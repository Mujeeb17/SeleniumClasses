package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");

        //must switch to iframe first
        //there's only 1 iframe so use index 0
        driver.switchTo().frame(0);

        //get the element which you want to drag
        WebElement dragable = driver.findElement(By.id("draggable"));

        //get the element which we want to drop in to
        WebElement drop = driver.findElement(By.id("droppable"));

        //use Actions class to drag and drop
        Actions actions = new Actions(driver);

        actions.dragAndDrop(dragable, drop).perform();
    }
}
