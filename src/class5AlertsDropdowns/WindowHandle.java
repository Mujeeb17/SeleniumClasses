package class5AlertsDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //gmail.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S235425384%3A1678243160928599&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfBI7oirrNsRqOsl31HN6CoM80pxq3WRrrIaJI3sw3nIORh1-Cd2pSihOczuRfgjq1uKfxOuQ");
        driver.manage().window().maximize();

        //this 'clicks' open a new tab
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        //even though we opened these tabs, our driver is still stuck on gmail.com
        //because we never switched the focus of the driver using switchTo()

        //get the window handle of the parent window
        System.out.println(driver.getWindowHandle());

        //get window handles of all handles that have opened
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

        //switch to the help window using
        for(String x: handles){
            //switch the focus of the driver to the handle the iterator is currently on
            driver.switchTo().window(x);
            //check the title of the window which the driver is focused on
            String t = driver.getTitle();

            //condition that will break the loop once the driver is focused on the window we want
            //we get 'google acc help' by inspecting DOM and ctrl+f and then type //title
            if(t.equals("Google Account Help")){
                break;
            }
        }

        //verifying we switched to the right window
        System.out.println(driver.getTitle());
    }
}
