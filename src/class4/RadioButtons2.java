package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //find all age group radio buttons

        //the common attribute between the (0 to 5, 5 to 15, 15 to 50) is name=ageGroup
        //so we store them all in a list which .findElements() allows us to
        List<WebElement> ageGroupBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        //iterate through them all to see the value of them all
        //after inspecting on google, the 'value' attribute holds the
        //info that we want (differentiates between them)
        for(WebElement radioBtn: ageGroupBtns){
            System.out.println(radioBtn.getAttribute("value"));

            //if the value is 5 - 15, click on it
            //first we need to store the values of each attribute
            String age = radioBtn.getAttribute("value");
            //if condition that clicks the desired radio button
            if(age.equalsIgnoreCase("5 - 15")){
                radioBtn.click();
            }
        }
    }
}
