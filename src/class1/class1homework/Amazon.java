package class1.class1homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1. launch the browser
 * 2. navigate to amazon web site
 * 3. print out the title and the url in the console
 * 4. close the browser
 */
public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
