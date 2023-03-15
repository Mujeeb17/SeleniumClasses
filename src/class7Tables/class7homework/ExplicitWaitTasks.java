package class7Tables.class7homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTasks {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //1st button
        driver.findElement(By.xpath("//button[contains(text(), 'Click')]")).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();

        //2nd button
        driver.findElement(By.xpath("//button[contains(text(), 'Change')]")).click();
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "Selenium Webdriver"));
        String x = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
        System.out.println("text displayed is: " + x);

        //3rd button
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("Is 'Enabled' button displayed: " + driver.findElement(By.xpath("//button[@id='hidden']")).isDisplayed());

        //4th button
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
        System.out.println("Is 'Button' enabled: " + driver.findElement(By.xpath("//button[@id='disable']")).isEnabled());

        //5th button
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//input[@id='ch']"), true));
        System.out.println("Is checkbox clicked: " + driver.findElement(By.xpath("//input[@id='ch']")).isSelected());

    }
}
