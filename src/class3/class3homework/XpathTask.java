package class3.class3homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
use xpath to complete this

goto http://practice.syntaxtechs.net/basic-first-form-demo.php
enter the message in the text box
click on show message
Enter value of a
Enter value of B
click on the button get total
also please print the value of the attribute type of the button GET TOTAL
 */
public class XpathTask {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("hello selenium");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        WebElement val = driver.findElement(By.xpath("//button[text()='Get Total']"));
        val.click();

        System.out.println(val.getText());
    }
}
