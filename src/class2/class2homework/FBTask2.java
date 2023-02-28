package class2.class2homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clicking on create new account
we will discuss "WHY" in future
 */
public class FBTask2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://fb.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Bob");
        driver.findElement(By.name("lastname")).sendKeys("Brown");
        driver.findElement(By.name("reg_email__")).sendKeys("BobbyBrown@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("BobbyBrown@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("MyNameISBOBBYBROWNIE");
        driver.findElement(By.name("birthday_year")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("option[value='1980']")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("_58mt")).click();

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(8000);

        //there's no popup?

        driver.quit();
    }
}
