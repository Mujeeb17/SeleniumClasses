package ReviewClasses.review4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XpathAdvanced {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://app.hubspot.com/login/");
        driver.manage().window().maximize();

        //travelling between web elements (even though there is a shorter way)
        WebElement email = driver.findElement(By.xpath("//i18n-string[text()='Email address']/parent::span/parent::label/parent::div/following-sibling::div/input"));

    }
}
