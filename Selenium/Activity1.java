package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.get("https://v1.training-support.net/selenium/login-form");
        driver.findElement(By.id("username")).sendKeys("Username");
        driver.findElement(By.id("password")).sendKeys("Password");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        System.out.println(driver.getTitle());

        // Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.quit();




    }

}
