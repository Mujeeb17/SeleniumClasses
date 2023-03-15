package class6WaitsIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        //implementing explicit wait, 20 is max waiting time
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        //once element is visible, then get the text
        //before, we were just waiting for the element, now we need to find it
        WebElement x = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));

        System.out.println(x.getText());

        driver.quit();
    }
}
