package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
    public static void main(String[] args) throws InterruptedException {

        //first step, tell your project where web-driver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //next, we have to create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open the website facebook.com
        //you have to pass a String which is the url of the website
        driver.get("https://www.facebook.com");

        //get the current url that is there in the browser and store it in a variable
        String url = driver.getCurrentUrl();

        //print the value you just saved
        System.out.println(url);

        //get the title of the webpage and print it
        System.out.println(driver.getTitle());

        //this statement slows down the execution of code, it
        //allows us to take a moment to see the website before the
        //quit() method is executed
        Thread.sleep(3000);

        //now close the browser
        driver.quit();

    }
}
