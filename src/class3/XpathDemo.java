package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");

        driver.manage().window().maximize();

        //to find Xpath through inspect on google, make sure you
        // use ctrl+f first
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");

        //we can also store an element in a variable and then send keys in a separate line of code like this:
        WebElement i = driver.findElement(By.xpath("//input[@type='password']"));
        i.sendKeys("test");

        //task get the text "username" that is displayed on the website and print it on the IntelliJ console
        WebElement user = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(user.getText());

        //now get the password text
        WebElement pw = driver.findElement(By.xpath("//label[text()='Password:']"));
        String pwText = pw.getText();
        System.out.println(pwText);
    }
}
