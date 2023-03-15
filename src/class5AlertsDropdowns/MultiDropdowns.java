package class5AlertsDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultiDropdowns {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dd = driver.findElement(By.xpath("//select[@id='multi-select']"));

        Select s = new Select(dd);

        s.selectByValue("New Jersey");
        s.selectByIndex(0);
        s.selectByVisibleText("New York");
        Thread.sleep(1500);
        //when it comes to multi-select dropdown, we can also deselect
        s.deselectByValue("New York");

        // isMultiple() tells you whether the dropdown allows you have multiple selections
        System.out.println(s.isMultiple());
    }
}
