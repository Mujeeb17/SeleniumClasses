package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();

        //this doesn't work because the code executes faster than the website can load
        //the "first name" text box
//        driver.findElement(By.name("firstname")).sendKeys("abracadabra");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).sendKeys("Bobbeebee");

    }
}
