package class7Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //task: get the whole table and print it in the console
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
//        System.out.println(table.getText());

        //task: access the rows of the table and print them
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));

        for(WebElement x: rows){
            System.out.println(x.getText());
        }

        System.out.println("**************");

        //task: print the row that contains company google
        for(WebElement x: rows){
            if(x.getText().contains("Google")){
                System.out.println(x.getText());
            }
        }

        System.out.println("*********");

        //task: accessing columns
//        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//        for(WebElement x: columns){
//            System.out.println(x.getText());
//        }

        System.out.println("**********");

        //task: print first column of every row
        List<WebElement> companies = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for(WebElement x: companies){
            System.out.println(x.getText());
        }
    }
}
