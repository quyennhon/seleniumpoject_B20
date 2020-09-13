package day5_testNG_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_SeleniumEasy_Task1 {
    public static void main(String[] args) {
//        TC	#2:	SeleniumEasy	Checkbox Verification – Section	1
//        1. Open	Chrome	browser
//        2. Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
//        3. Verify	“Success	– Check	box	is	checked”	message	is	NOT displayed.
//        4. Click	to	checkbox	under	“Single	Checkbox	Demo”	section
//        5. Verify	“Success	– Check	box	is	checked”	message	is displayed.
//
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
//3.Verify	“Success	–Check	box	is	checked”	message	is	NOTdisplayed



    }
}
