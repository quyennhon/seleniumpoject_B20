package day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {

//        Practice:	Cybertek	Checkboxes
//        1. Go	to	http://practice.cybertekschool.com/checkboxes
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
//
//         // Locating the first checkbox
       WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
//        2. Confirm	checkbox	#1	is	NOT	selected	by	default

        if(!checkbox1.isSelected()){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
//        3. Confirm	checkbox	#2	is	SELECTED	by	default.
        if(checkbox2.isSelected()){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
//        4. Click	checkbox	#1	to	select	it.
        Thread.sleep(1000);
        checkbox1.click();

//        5. Click	checkbox	#2	to	deselect	it.
        Thread.sleep(1000);
        checkbox2.click();

//        6. Confirm	checkbox	#1	is	SELECTED.


//        7. Confirm	checkbox	#2	is	NOT	selected.
    }
}
