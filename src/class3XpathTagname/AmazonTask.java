package class3XpathTagname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonTask {
    public static void main(String[] args) {

        //get all links from the amazon website using Tagname locator

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //next, we have to create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //we know that all links are in tag <a>
        //because we are looking for several elements we use findElements()
        List<WebElement> list = driver.findElements(By.tagName("a"));

        //in order to print we need to use loop
        for(WebElement x: list){

            //the links inside the <a> tag are stored in the attribute 'href'
            //so we need to get extract the value from the attribute 'href' and print it
            String link = x.getAttribute("href");
            System.out.println(link);
        }
    }
}
