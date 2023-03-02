package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        driver.manage().window().maximize();

        //using CSS locator, create a variable that stores the location of the 'create new account' button
        WebElement createNew = driver.findElement(By.cssSelector("a[rel = 'async']"));

        //clicking on the button
        createNew.click();
        //slowing down the code to give the browser time to open the new window
        Thread.sleep(1000);

        //fill in the info
        driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys("Bobby");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Brown");
    }
}
