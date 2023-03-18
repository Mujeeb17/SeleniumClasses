package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.delta.com/ca/en");

//       click on the calander
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

//         get the month from the calander
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
//        get the next button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

//        click on next button until you find the right month
        boolean isFound = false;

        while (!isFound) {

            String text = month.getText();
            if (text.equalsIgnoreCase("January")) {
//                select the day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for (WebElement day : days) {
                    String day_text = day.getText();
                    if (day_text.equalsIgnoreCase("20")) {
                        day.click();
                        isFound = true;
                        break;
                    }
                }

            } else {
                next.click();
            }

        }
    }
}