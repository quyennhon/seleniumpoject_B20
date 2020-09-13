package day3_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask2 {
    public static void main(String[] args) {
        /*
        TC #2:
Zero Bank link text verification1.Open Chrome browser
2.Go to http://zero.webappsecurity.com/login.html
3.Verify link text from top left:Expected: “Zero Bank”
4.Verify link hrefattribute value contains:Expected: “index.html
         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println(driver.findElement(By.tagName("a")).getText());

        String expectedText ="Zero Bank";
        String actualText  = driver.findElement(By.tagName("a")).getText();

        if (actualText.contains(expectedText)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");

        System.out.println("=======================");

        String expectedInHREF ="index.html";
        String actualHREF  = driver.findElement(By.tagName("a")).getAttribute("href");
        System.out.println(driver.findElement(By.className("brand")).getAttribute("href"));


        if (actualHREF.contains(expectedInHREF)){
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