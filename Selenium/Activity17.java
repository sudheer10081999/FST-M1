package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Activity17 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver Driver =new FirefoxDriver();
        Driver.get("https://v1.training-support.net/selenium/selects");


    }
}
