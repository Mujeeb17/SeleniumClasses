package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        //use switchTo() method so that the driver can shift to the alert pop up
        Alert alert = driver.switchTo().alert();

        Thread.sleep(1000);
        alert.accept();


        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        //switch the focus to alert
        alert.sendKeys("abracadabra");
        Thread.sleep(1500);
        //accept
        alert.accept();
    }
}
