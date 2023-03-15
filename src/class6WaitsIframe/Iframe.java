package class6WaitsIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.uitestpractice.com/Students/Switchto");
        driver.manage().window().maximize();

        //we have to switch the focus to the iframe so we cen type in the text
        //1st way we can switch is by index (Manually found by inspecting the DOM)
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("blahblahblah");

        //switches the driver's focus back to the main page
        driver.switchTo().defaultContent();

        //proving it
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println(text.getText());

        //task: get the text "Enter name" in iframe
        //2nd way to switch to it is by name or id
        driver.switchTo().frame("iframe_a");
        WebElement iframeText = driver.findElement(By.xpath("//label"));
        System.out.println(iframeText.getText());

        //switching back to main page
        driver.switchTo().defaultContent();

        //3rd way to switch to iframe is by WebElement
        WebElement iframe = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(iframe);

        //task: clear whatever is inside the text box currently
        driver.findElement(By.xpath("//input[@id='name']")).clear();
    }
}
