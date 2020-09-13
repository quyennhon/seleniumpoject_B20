package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        String expectTitle = "Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectTitle)){
            System.out.println("Title verification PASSED");
        }
        else{
            System.out.println("Title verification FAILED");
        }

    }
}
