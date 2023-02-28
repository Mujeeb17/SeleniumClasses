package class2.class2homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();

        //filling out form
        driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
        driver.findElement(By.id("customer.lastName")).sendKeys("Brown");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 My Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Toronto");
        driver.findElement(By.id("customer.address.state")).sendKeys("Ontario");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("I5O80H");
        driver.findElement(By.id("customer.ssn")).sendKeys("987 654 321");
        driver.findElement(By.id("customer.username")).sendKeys("BobbyBob123");
        driver.findElement(By.id("customer.password")).sendKeys("MyN4am31SB0B");
        driver.findElement(By.id("repeatedPassword")).sendKeys("MyN4am31SB0B");

        //clicking on register
        driver.findElement(By.cssSelector("input[value=Register]")).click();

        //closing browser
        driver.quit();
    }
}
