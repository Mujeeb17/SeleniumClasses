package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablesDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        //logging in
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        driver.findElement(By.xpath("//b[text()='PIM']")).click();


        //previous homework task modified so that it works tables that have pagination
        boolean idFound = false;
        while (!idFound) {

            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

            for (int i = 0; i < rows.size(); i++) {

                String text = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[2]")).getText();
                if (text.equals("48766A")) {
                    driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]/input")).click();
                    idFound = true;
                    break;
                }
            }

            if(!idFound){
                driver.findElement(By.xpath("//a[text()='Next']")).click();
            }
        }
    }
}
