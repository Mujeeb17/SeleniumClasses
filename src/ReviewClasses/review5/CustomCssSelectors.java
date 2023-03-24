package ReviewClasses.review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomCssSelectors {
    public static void main(String[] args) throws InterruptedException {

        //ID in CSS --> #id
        // tagName#idValue

        //class in CSS --> .class
        // tagName.classValue
        //if there are multiple class values, use .class1Value.class2Value. etc. (order doesn't matter)

        //any other attribute: tagName[attribute='attributeValue']
        //for multiple other attributes: tagName[attribute='attributeValue'][attribute='attributeValue']...

        //combining class/id/other attributes is possible in css by: #idValue.classValue[attribute='attributeValue]

        //traversing from parent tagname to child tagname, is as simple as putting a space:
        // parentTagName hildTagName

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://app.hubspot.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input.login-email")).sendKeys("Bobby");
        Thread.sleep(1000);

    }
}
