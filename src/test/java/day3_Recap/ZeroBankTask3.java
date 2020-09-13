package day3_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask3 {
    public static void main(String[] args) {
        /*
        TC #3: Zero Bank login title verification1.Open Chrome browser
        2.Go to http://zero.webappsecurity.com/login.html
        3.Enter username: username
        4.Enter password: password
        5.Verify title changed to:Expected: “Zero –Account Summary”


         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        System.out.println(driver.getTitle());

        String expectedText ="Zero - Account Summary";
        String actualText  = driver.getTitle();

        if (actualText.equals(expectedText)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");
    }
}
