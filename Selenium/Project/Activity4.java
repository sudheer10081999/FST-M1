package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        // System.out.println(driver.getTitle());
        // driver.quit();

        String str = driver.findElement(By.xpath("//h2[normalize-space()='Quia quis non']")).getText();

        if (str.equals("Quia quis non")) {
            // Close the Browser
            System.out.println("Page title matching, So Closing the browser");
            driver.quit();
        } else {
            System.out.println("Page title doesn't matches");
            driver.quit();


        }
    }
}