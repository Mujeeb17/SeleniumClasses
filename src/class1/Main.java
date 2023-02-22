package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // launches browser
        driver.get("https://google.com/"); // navigates to this url

        if (driver.getCurrentUrl().contains("google.com")){
            System.out.println("URLs match");
        }
        if (driver.getTitle().equalsIgnoreCase("google")){
            System.out.println("titles do match");
        }

        driver.close();

        String s = "I am writing a sentence that I will be using the time method so it prints out slowly";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            Thread.sleep(100);
        }
    }
}