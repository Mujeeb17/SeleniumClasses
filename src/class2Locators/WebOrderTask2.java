package class2Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //task:
        //login
        //get title and verify it is correct
        //logout
        //close browser

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        //logging in
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();

        //getting title and seeing if it matches
        String title = driver.getTitle();
        if(title.equals("Web Orders")){
            System.out.println("Match");
        } else {
            System.out.println("no match");
        }

        //logging out
        driver.findElement(By.linkText("Logout")).click();

        //closing browser
        driver.quit();
    }
}
