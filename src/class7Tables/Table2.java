package class7Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //task: print everything from Country column
        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        for(WebElement x: countries){
            System.out.println(x.getText());
        }
    }
}
