package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        //click on 'male' radio button
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));

        //check if the radio button is enabled
        System.out.println("the male radio button is enabled: " + maleBtn.isEnabled()); // returns true
        //check if radio button is displayed
        System.out.println("the male radio button is displayed: " + maleBtn.isDisplayed()); //
        //check if male radio button is selected
        System.out.println("is the male button selected: "+ maleBtn.isSelected());

        //method that will click on male if it's not already selected
        if(!maleBtn.isSelected()){
            maleBtn.click();
        }
        //check again if male button is selected
        System.out.println("is the male button selected now?: "+ maleBtn.isSelected());

        //now check if the female button is selected
        //first make the variable
        WebElement femBtm = driver.findElement(By.cssSelector("input[value='Female']"));
        System.out.println("is the female button selected: " + femBtm.isSelected());
    }
}
