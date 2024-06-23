package liveproject;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.util.Arrays;

import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

public class W3ActionBase {
    //Create The Pointer
   private static final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

   //Create The Action
    public static void doswipe(AppiumDriver driver, Point start,Point end, int duration){
        Sequence swipe = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(ofMillis(0),viewport(),start.getX(), start.getY()))
                .addAction(finger.createPointerDown(LEFT.asArg()))
                .addAction(finger.createPointerMove(ofMillis(duration), viewport(), end.getX(),end.getY()));

        //perform the action
        driver.perform(Arrays.asList(swipe));

    }

}
