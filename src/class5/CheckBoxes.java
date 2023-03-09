package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        List<WebElement> cb = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (int i = 0; i < cb.size(); i++) {

            String value = cb.get(i).getAttribute("value");

            if (value.equals("Option-2")){
                cb.get(i).click();
            }
        }
    }
}
