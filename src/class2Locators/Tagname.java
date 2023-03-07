package class2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amaxon.com");

        driver.manage().window().maximize();

        //task: print all the link in the amazon.com

        //use the tag <a> because these always have links
        //note we use findElements() with an s
        driver.findElements(By.tagName("a"));

    }
}
