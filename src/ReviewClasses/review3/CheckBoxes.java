package ReviewClasses.review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).click();
        }
    }
}
