package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {
    public static void main(String[] args) throws InterruptedException {

        //connect to WebDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //initiate instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //opening google.com
        driver.get("https://google.com");
        Thread.sleep(2000); // slows it down

        //now navigate to facebook.com
        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000); // slows it down

        //go back to google
        driver.navigate().back();
        Thread.sleep(2000); // slows it down

        //go back to facebook
        driver.navigate().forward();
        Thread.sleep(2000); // slows it down
        //.get() and .navigate() do the same thing but .navigate() has more options like .back()

        //now refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

        //now close the browser
        driver.close();
    }
}
