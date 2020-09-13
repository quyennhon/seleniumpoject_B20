package day3_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*TC #4: Facebook header verification
    1.Open Chrome browser
    2.Go to https://www.facebook.com
    3.Verify “Create a page” link href value contains text: Expected: “registration_form”

 */
public class FacebookTask4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

//<a href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a>

        //System.out.println( driver.findElement(By.linkText("Create a Page")).getText());
        System.out.println( driver.findElement(By.className("_8esh")).getAttribute("href"));
        //System.out.println( driver.findElement(By.id("href")).getText());


        String expectedText ="registration_form";
        String actualText  = driver.findElement(By.className("_8esh")).getAttribute("href");

        if (actualText.contains(expectedText)){
            System.out.println("PASS");
        }
        else
            System.out.println("FAILED");
    }
}
