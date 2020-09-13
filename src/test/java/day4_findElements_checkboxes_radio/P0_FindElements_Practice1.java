package day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {

//        TC #0: FINDELEMENTS
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//        3. Print out the texts of all links
        List <WebElement>listOfLinks= driver.findElements(By.xpath("//body//a"));

        for (WebElement eachLink: listOfLinks){
            System.out.println(eachLink.getText());
        }

//        4. Print out how many total link
        int numberOfLinks = listOfLinks.size();
        System.out.println("number of Links= "+ numberOfLinks);



    }
}
