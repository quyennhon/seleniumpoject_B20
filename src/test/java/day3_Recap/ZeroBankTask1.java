package day3_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1:
Zero Bank title verification1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify titleExpected: “Zero -Log in”



 */
public class ZeroBankTask1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedText ="Zero - Log in";
        String actualText  = driver.getTitle();

        if (actualText.contains(expectedText)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");
    }
}







/*
TIPS FOR TASK #1:
1.Set up driver
2.Open browser
3.Get webpage: http://zero.webappsecurity.com/login.html
4.Use .getTitle() method, and store the actual title in a String
5.Create expectedTitleString
6.Create if conditions to do your verificationTIPS FOR
TASK #2:1.Set up driver2.Open browser
3.Get webpage:http://zero.webappsecurity.com/login.html
4.Locate the“Zero Bank”linkusing classNamelocator
5.get the attribute value of href using .getAttribute() method and store it in actualHREFString
6.Create expectedInHREF String
7.Create if conditions to check actual value contains the expected value
 */