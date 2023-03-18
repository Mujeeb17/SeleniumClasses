package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUploadDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));
        //when we want to upload files, we use the sendKeys() method and then the file location
        chooseFile.sendKeys("C:/Users/mujee/Downloads/Difference_Between_Array_and_ArrayList.docx");

        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
    }
}
