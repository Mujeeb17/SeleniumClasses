package class8DynamicTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        driver.manage().window().maximize();

//        enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //task: check the box that contains ScreenSaver as a product
        List<WebElement> list = driver.findElements(By.xpath("//table[@class='SampleTable']//tbody//tr//td[3]"));

        for (int i = 0; i < list.size(); i++) {

            //extract the text
            String text = list.get(i).getText();
            if (text.equals("ScreenSaver")) {
                //after inspecting the DOM, the tr[] index must be + 2 (+1 because of index based 1, another +1 because of the top row)
                //td[1] is always one because the checkbox is always in first column
                driver.findElement(By.xpath("//table[@class='SampleTable']//tbody//tr[" + (i+2) + "]//td[1]//input")).click();
            }
        }
    }
}
