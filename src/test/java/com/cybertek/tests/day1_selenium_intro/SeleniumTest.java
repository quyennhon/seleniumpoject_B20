package com.cybertek.tests.day1_selenium_intro;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //2 - create the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // 3- test if driver is working
        driver.get("https://www.google.com");
        driver.get("http://wwww.facebook.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String actualUrl= driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        Thread.sleep(3000);
        driver.manage().window().maximize();

//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.navigate().to("http://www.amazon.com");
//
//        driver.close();
//
//       driver.getCurrentUrl();

        //.get(“url”);•* get("url")--> this method launches the browser and goes to the given url.
        //SELENIUM NAVIGATIONS
        // •back -> takes to previous page
        // •forward -> takes us to forwarded page
        // •refresh -> refreshes the page
        // •to -> takes user to another given url.
        // •Syntax:driver.navigate().back();
        // •driver.navigate().forward;
        // •driver.navigate().refresh();
        // •driver.navigate().to();
    }
}
