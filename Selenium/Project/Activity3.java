package JOB;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");

        String msg = String.valueOf (driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']")).getLocation());
       // String abc=driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']").getClass());




        System.out.println(msg);

        driver.quit();




    }
}
