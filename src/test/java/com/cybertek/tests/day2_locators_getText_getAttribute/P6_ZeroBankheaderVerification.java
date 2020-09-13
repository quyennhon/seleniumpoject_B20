package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_ZeroBankheaderVerification {
    public static void main(String[] args) {
        /*
        TC #6: Zero Bankheader verification
        1.Open Chrome browser
        2.Go to http://zero.webappsecurity.com/login.html
        3.Verify header textExpected: “Log in to ZeroBank”
         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedText ="Log in to ZeroBank";
        String actualText  = driver.findElement(By.tagName("h3")).getText();

        if (actualText.equals(expectedText)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");
    }
}
