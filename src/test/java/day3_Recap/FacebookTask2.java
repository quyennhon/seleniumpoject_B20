package day3_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask2 {
    /*
    TC #2: Facebook incorrect login title verification1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Enter incorrect username
    4.Enter incorrect password
    5.Verify title changed to: Expected: “Log into Facebook | Facebook”
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("abcd");
        driver.findElement(By.id("pass")).sendKeys("abcd"+ Keys.ENTER);



        System.out.println(driver.getTitle());
        String expectedTitle="Log into Facebook | Facebook";
        String actualTitle= "driver.getTitle()";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");

    }
    }

