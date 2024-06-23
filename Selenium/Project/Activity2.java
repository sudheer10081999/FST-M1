package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        String Message = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();

        if (Message.equals("Welcome to Alchemy Jobs")) {
            // Close the Browser
            System.out.println("Page title matching, So Closing the browser");
            driver.quit();
        } else {
            System.out.println("Page title doesn't matches");
            driver.quit();



        }
    }
}