package ReviewClasses.review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.redbus.in");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

        while (true) {
            //3. Capture Year and Month
            String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            if (monthYear.equals("Aug 2023")) {
                // perform some operation
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tr/td"));
                for (WebElement dt : dates) {
                    if (dt.getText().equals("27")) {
                        dt.click();
                        break;
                    }
                }
            } else {
                driver.findElement(By.xpath("//td[@class='next']")).click();
            }


        }
    }
}
