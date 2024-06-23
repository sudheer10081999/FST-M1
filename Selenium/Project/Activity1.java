package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.get("https://alchemy.hguy.co/jobs/");
        // System.out.println(driver.getTitle());
        // driver.quit();

        String str = "Alchemy Jobs – Job Board Application";
        String pageTitle = driver.getTitle();

        if ( pageTitle.equals("Alchemy Jobs – Job Board Application1") ){
            // Close the Browser
            System.out.println("Page title matching, So Closing the browser");
            driver.quit();
        } else {
            System.out.println("Page title doesn't matches");
            driver.quit();
        }
    }
}

