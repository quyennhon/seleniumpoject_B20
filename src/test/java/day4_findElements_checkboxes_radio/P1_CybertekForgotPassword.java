package day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_CybertekForgotPassword {
    public static void main(String[] args) {
        //    TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//            3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
//    a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
//    b. “Forgot password” header
        WebElement header = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
//    c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
//    d. E-mail input box
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));

//    e. “Retrieve password” button
        WebElement inputBox = driver.findElement(By.cssSelector("button#form_submit"));
        //  button[class='radius']
        //button.radius

//    f. “Powered by Cybertek School” text
        WebElement linkText = driver.findElement(By.xpath("//a[.='Cybertek School']"));
        WebElement powerByDiv = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("linkText = "+ linkText.getText());
        System.out.println("powerByDiv= "+ powerByDiv.getText());
//4. Verify all WebElements are displayed.
        // .isDisplaced --> returns true if given web element is displaced
        //.isDisplaced --> returns false if g.. Not
        if (homeLink.isDisplayed()&& emailLabel.isDisplayed()&&emailInput.isDisplayed()&& header.isDisplayed()&&powerByDiv.isDisplayed())
        {
            System.out.println("ALL WEB ELEMENTS ARE DISPLACED. VERIFICATION PASSED!");
        }
        else{
            System.out.println("One or more of he wbe elements are not displaced. VERIFICATION FALLED");
        }
//            Better if you do with both XPATH and CSS selector for practice purposes.
    }

}
