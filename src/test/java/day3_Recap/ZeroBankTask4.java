package day3_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask4 {
    /*
        TC #4: Zero Bank login title verification1.Open Chrome browser
        2.Go to http://zero.webappsecurity.com/login.html
        3.Enter username: username
        4.Enter password: password
        5.Click to “Account Activity” link
        6.Verify title changed to:Expected: “Zero –Account Activity”
        7.Click to “Transfer Funds” link
        8.Verify title changed to:Expected: “Zero – Transfer Funds”
        9.Click to “Pay Bills” link
        10.Verify title changed to:Expected: “Zero - Pay Bills”
        11.Click to “My Money Map” link
        12.Verify title changed to:Expected: “Zero – My Money Map”
        13.Click to “Online Statements” link
        14.Verify title changed to:Expected: “Zero – Online Statements”

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        driver.findElement(By.linkText("Account Activity") ).click();
        Verification("Zero - Account Activity",driver.getTitle());


        driver.findElement(By.linkText("Transfer Funds") ).click();
        Verification("Zero - Transfer Funds",driver.getTitle());

        driver.findElement(By.linkText("Pay Bills") ).click();
        Verification("Zero - Pay Bills",driver.getTitle());

        driver.findElement(By.linkText("My Money Map") ).click();
        Verification("Zero - My Money Map",driver.getTitle());

        driver.findElement(By.linkText("Online Statements") ).click();
        Verification("Zero - Online Statements",driver.getTitle());
//

    }


    public static void Verification(String a, String b){
        if (b.equals(a)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");
    }
}
