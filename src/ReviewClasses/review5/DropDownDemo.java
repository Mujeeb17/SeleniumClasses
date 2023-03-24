package ReviewClasses.review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://orangehrm.com/contact-sales/");
        driver.manage().window().maximize();

        WebElement countryDD = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
        Select country = new Select(countryDD);

        List<WebElement> list = country.getOptions();
        for(WebElement x: list){
            if(x.getText().equalsIgnoreCase("Belarus")){
                x.click();
                break;
            }
        }
    }
}
