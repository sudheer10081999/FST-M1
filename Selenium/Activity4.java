package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
        String mac = driver.findElement(By.id("third-header")).getText();
        System.out.println(mac);
        String mwe=driver.findElement(By.xpath("//h4[@class='ui olive header']")).getCssValue("color");
        System.out.println(mwe);

        String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        // Find the grey button and print its text
        String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println(greyButtonText);


        driver.close();


    }
}
