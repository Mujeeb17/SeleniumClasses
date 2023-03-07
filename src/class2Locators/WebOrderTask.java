package class2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //good practice is to always maximize screen when you open the website
        driver.manage().window().maximize();

        //type inside the "username"
        // we shouldn't use class locator because there is a duplicate
        //just go with id locator cause there's not other options
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //type inside the "password"
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //now click on the login button
        driver.findElement(By.className("button")).click();
    }
}
