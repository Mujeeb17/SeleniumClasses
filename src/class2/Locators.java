package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.ByteBuffer;

public class Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        //task is to actually input text where it says "username" and "password"
        //we are using the id and name locator and seeing the value of it when we inspect
        //the web element manually on Google
        driver.findElement(By.id("email")).sendKeys("thisismyusername");
        driver.findElement(By.name("pass")).sendKeys("passworddddd");

        //task: click on the button create new account
        //there are no locators that we want to use (because class and name
        // has number) so we can use linktext because it follows those conditions
//        driver.findElement(By.linkText("Create new account")).click();

        //task click on forgotten password
        driver.findElement(By.linkText("Forgot password?")).click();
//        driver.findElement(By.partialLinkText("Forgotten")).click(); this code does the same thing as above line
    }
}
