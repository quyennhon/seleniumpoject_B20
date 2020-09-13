package day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P2_MerriamWebster_Links {
    public static void main(String[] args) {
//        TC #0: FINDELEMENTS
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
//        2. Go to https://www.merriam-webster.com/
        driver.get(" https://www.merriam-webster.com/");
//        3. Print out the texts of all links
        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));

        int linksWithoutText=0;
        int linksWithText = 0;

        for (WebElement each: listOfLinks){
            String textOfEachLink= each.getText();
            System.out.println(each.getText());
            if(textOfEachLink.isEmpty()){
                linksWithoutText++;
            }
            else{
                linksWithText++;
            }
        }


//        4. Print out how many link is missing text
        System.out.println(linksWithoutText);
//        5. Print out how many link has text
        System.out.println(linksWithText);
//        6. Print out how many total link
        int numberOfLinks = listOfLinks.size();
        System.out.println("number of Links= "+ numberOfLinks);


    }
}
