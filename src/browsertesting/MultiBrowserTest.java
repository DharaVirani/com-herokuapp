package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
//        Open Url
        driver.get(baseUrl);
//        Maximise
        driver.manage().window().maximize();
//        Implicitly Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//      Print the title
        System.out.println("Title of the page: " + driver.getTitle());
//        Print the current Url
        System.out.println("Current URL: " + driver.getCurrentUrl());
//        Print the page source
        System.out.println("Page source is: " + driver.getPageSource());
//        Enter the email to email field
        driver.findElement(By.id("username")).sendKeys("abc123@gmail.com");
//        Enter the password to password field
        driver.findElement(By.id("password")).sendKeys("abc45678");
//        Browser closed
        driver.close();
    }
}
