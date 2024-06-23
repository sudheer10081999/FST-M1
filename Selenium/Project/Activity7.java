package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");

        driver.findElement(By.xpath("//a[normalize-space()='Post a Job']")).click();

        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("SudheerPydikalva@gmail.com");
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("MRFTyres");
        driver.switchTo().frame("job_description_ifr");
        driver.findElement(By.xpath(""));
        driver.switchTo().defaultContent();
        //driver.findElement(By.xpath("//html")).sendKeys("ABC123");
        //driver.findElement(By.partialLinkText("document.querySelector(\"html\")")).sendKeys("23456");
//        driver.findElement(By.id("mceu_16")).sendKeys("34567823");
        //driver.quit();
driver.findElement(By.xpath("/html[1]")).sendKeys("456789ertyui");
        //driver.findElement(By.id("mceu_16")).sendKeys("To ensure that their company's software products are as effective and glitch-free as possible, Testers perform a variety of tasks. We analyzed several online job listings to identify these key duties and responsibilities.");
        driver.findElement(By.id("application")).sendKeys("abc123@gmail.com");
        driver.findElement(By.id("company_name")).sendKeys("TechM123");
        driver.findElement(By.name("submit_job")).click();
        driver.findElement(By.id("job_preview_submit_button")).click();

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//a[normalize-space()='Jobs']")).click();

        driver.findElement(By.name("search_keywords")).sendKeys("TechM123");
        //driver.findElement(By.xpath("//input[@id='search_location']")).sendKeys("Pune");

        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();

        driver.close();







    }
}