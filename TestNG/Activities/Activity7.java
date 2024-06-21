package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    @BeforeClass
    public void Setup(){
        WebDriverManager.firefoxdriver().setup();

        driver=new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/lohin.form");
    }


    @DataProvider(name = "Credentials")
    public static Object[][] creds(){
        return new Object[][] {
                {"admin","password","welcome Back ,admin"},
                {"wrondAdmin","wrongPassword","Invalid Cedentials"}
        };
    }

    @Test (dataProvider = "Credentials")
    public void loginTest(String username,String password,String expectedmessage){
        WebElement usernameField=driver.findElement(By.id("Username"));
        WebElement passwordField=driver.findElement(By.id("password"));
        WebElement loginButton=driver.findElement(By.xpath("//button[text()='Log in']"));

        usernameField.clear();
        passwordField.clear();

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        String confirmationMessage=driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(confirmationMessage ,expectedmessage);
        System.out.println("done");

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
