package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize3 {
    public static void main(String[] args) throws InterruptedException {

        //connect to webdriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");

        //maximize the window
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //full screen
        driver.manage().window().fullscreen();
        Thread.sleep(1000);


        //close the window
        driver.quit();
    }
}
