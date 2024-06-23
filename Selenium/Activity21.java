package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity21 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/tab-opener");

        String abc= driver.getPageSource();
       // System.out.println(abc);

        String abcd= driver.getCurrentUrl();
       // System.out.println(abcd);
        driver.manage().window().fullscreen();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().toString();
        System.out.println(abcd);
        driver.navigate().to("https://FB.com");


        driver.close();

      //  driver.findElement(By.id("launcher")).click();


      //  driver.findElement(By.id("actionButton")).click();

    }
}
