package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/ajax");
        driver.getTitle();
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
        driver.wait(4000);

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='HELLO!']"));
        //System.out.println(mesage);
        driver.wait(4000);
        String mesage1=driver.findElement(By.xpath("//h3[1]")).getText();
        System.out.println(mesage1);
        driver.quit();




    }
}
