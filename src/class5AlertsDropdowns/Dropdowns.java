package class5AlertsDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dd = driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select s = new Select(dd);

        //Select class has selectByIndex() method
        //the index is 0 based but in this specific site, index 0 is not selectable (as seen in the DOM)
        s.selectByIndex(2); // Monday
        Thread.sleep(1500);

        //the selectByValue() method
        //uses the word inside the 'value' attribute
        s.selectByValue("Wednesday");
        Thread.sleep(1500);

        //the selectByVisibleText() method
        //uses the text that's inside that element
        s.selectByVisibleText("Friday");
        Thread.sleep(1500);
    }
}
