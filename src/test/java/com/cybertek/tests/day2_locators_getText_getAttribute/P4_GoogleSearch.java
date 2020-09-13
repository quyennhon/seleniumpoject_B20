package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    /*
    TC#4:	Google	search
    1-Open	a	chrome	browser
    2-Go	to:	https://google.com
    3-Write	“apple”	in	search	box
    4-Click	google	search	button
    5-Verify	title:Expected:	Title	should	start	with	“apple
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        //    syntax : driver.findElement(By.name("asdf")).sendKeys("Words to be send to page");

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        //driver.findElement(By.linkText("")).click();
        String expectedTitle ="apple - Google Search";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
        }

    }
}
