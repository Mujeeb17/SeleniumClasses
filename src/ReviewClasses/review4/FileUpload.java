package ReviewClasses.review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@type='file'][2]")).sendKeys("C:\\Users\\mujee\\Downloads\\Difference_Between_Array_and_ArrayList.docx");
    }
}
