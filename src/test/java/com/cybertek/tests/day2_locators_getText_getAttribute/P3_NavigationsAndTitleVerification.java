package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    /*
    TC #3: Back and forth navigation
    1-Open a chrome browser
    2-Go to: https://google.com
    3-Click to Gmail from top right.
    4-Verify title contains:Expected: Gmail
    5-Go back to Google by using the .back();
    6-Verify title equals:Expected: Google
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.findElement(By.linkText("Gmail")).click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        System.out.println(driver.getTitle());
        if (actualTitle.contains(expectedTitle)){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAILED");}


        driver.navigate().back();

        String expectedTitle2 = "Google";
        String actualTitle2 =        driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("PASS");
        }
        else
        { System.out.println("FAILED");}


    }
}
