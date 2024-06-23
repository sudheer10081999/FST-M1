package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");

        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[normalize-space()='Jobs']")).click();


        String str = driver.findElement(By.xpath("//a[normalize-space()='Alchemy Jobs']")).getText();

        if (str.equals("Alchemy Jobs")) {
            // Close the Browser
            System.out.println("Page title matching, So Closing the browser");
            driver.quit();
        } else {
            System.out.println("Page title doesn't matches");
            driver.quit();


        }
    }
}