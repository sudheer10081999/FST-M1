package stepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.dynalink.beans.StaticClass;

import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExample extends BaseClass {
    @BeforeAll
    //static WebDriver driver;
    public static void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }
    @AfterAll
    public static void teardownn(){
        driver.quit();
    }
    @Given("the user s on the homepage")
    public void openTSHomepage(){
        driver.get("https://v1.training-support.net/");
        Assertions.assertEquals("Training Support",driver.getTitle());


    }
    @When("User click on About us Link")
    public void clickaboutlink(){
        driver.findElement(By.id("about-link")).click();
    }

    @Then("user is redirected to About Page")
    public void verifyaboutpage(){
        Assertions.assertEquals("About Training Support",driver.getTitle());


    }
}
