package library;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Resource {
    @SuppressWarnings("rawtypes") //Will vanish rawtypes warning
	public static void horizontalSwipeByPercentage(AppiumDriver<MobileElement> driver, int startX, int endX, int startY) {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                .waitAction()
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }

}
