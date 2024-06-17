package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        Actions builder=new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println(driver.getTitle());

        WebElement abc =driver.findElement(By.id("draggable"));
        WebElement abcd =driver.findElement(By.id("droppable"));
        WebElement abce =driver.findElement(By.id("dropzone2"));

        builder.dragAndDrop(abc,abcd).build().perform();
        builder.clickAndHold(abc).moveToElement(abce).release().build().perform();
        System.out.println("its done");
        driver.close();






    }
}
