package class6WaitsIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/dynamic-data-loading-demo.php");

        //how do we know to wait explicitly or implicitly
        //while inspecting the DOM, when we generate a new user, the text is dynamic and
        //constantly changes. so we should be using implicit wait
        driver.findElement(By.xpath("//button[@id='save']")).click();
    }
}
