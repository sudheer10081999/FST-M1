package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");

        driver.findElement(By.xpath("//a[normalize-space()='Jobs']")).click();


        String str = driver.findElement(By.xpath("//a[normalize-space()='Alchemy Jobs']")).getText();

        if (str.equals("Alchemy Jobs")) {
            // Close the Browser
            System.out.println("Page title matching, So Closing the browser");

        } else {
            System.out.println("Page title doesn't matches");
            driver.quit();
        }
        driver.findElement(By.name("search_keywords")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@id='search_location']")).sendKeys("Pune");

        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        driver.findElement(By.xpath("//span[@class='tagline']")).getText();
        driver.findElement(By.xpath("//input[@value='Apply for job']")).click();

        String ste= driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();

        System.out.println(ste);
        driver.close();

    }}
