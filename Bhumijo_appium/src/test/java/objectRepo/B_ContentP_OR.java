//package pages;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.touch.offset.PointOption;
//
//public class BhumijoInfoPageObject {
//    protected AppiumDriver<MobileElement> driver;
//
//    @AndroidFindBy(xpath = "//android.widget.ImageView")
//    protected MobileElement VfyAffordableImage;
//
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Affordable']")
//    protected MobileElement VfyAffordableTxt;
//
//    @AndroidFindBy(xpath = "//android.widget.TextView[2]")
//    protected MobileElement VfyAffordable_subTxt;
//
//    @AndroidFindBy(xpath = "//android.widget.Button[contains(@index, '1')]")
//    protected MobileElement ClickStartBtn;
//
//    public BhumijoInfoPageObject(AppiumDriver<MobileElement> driver) {
//        this.driver = driver;
//        try {
//            PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
//        } catch (Exception e) {
//            System.out.println("Bhumijo Info Page Object: " + e);
//        }
//    }
//
//    public void ClickStartBtn() {
//        ClickStartBtn.click();
//        System.out.println("----> Start Button has been clicked");
//    }
//
//    public void VfyAffordableTxt() {
//        String headerTxt = VfyAffordableTxt.getText();
//        Assert.assertEquals(headerTxt, "Affordable");
//    }
//
//    public void VfyAffordable_subTxt() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[2]")));
//        MobileElement mobileElement = (MobileElement) element;
//        mobileElement.isDisplayed();
//        String headerSubTxt = mobileElement.getText();
//        Assert.assertEquals(headerSubTxt, "Get clean and safe public toilet services at an affordable price.\n");
//    }
//
//    public void horizontalSwipeByPercentage() {
//        int startX = driver.manage().window().getSize().width * 7 / 8;
//        int endX = driver.manage().window().getSize().width / 8;
//        int startY = driver.manage().window().getSize().height / 2;
//
//        TouchAction action = new TouchAction(driver);
//        action.press(PointOption.point(startX, startY))
//                .waitAction()
//                .moveTo(PointOption.point(endX, startY))
//                .release()
//                .perform();
//    }
//
//    public void VfyAffordableImage() {
//        VfyAffordableImage.isDisplayed();
//        System.out.println("----> Affordable Image is showing");
//    }
//}


package objectRepo;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class B_ContentP_OR {
	
	  public B_ContentP_OR(AppiumDriver<MobileElement> driver) {
	        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	    }
	
	// Affordable Content Page's Object Repositories
	  
    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public MobileElement VfyAffordableImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Affordable']")
    public MobileElement VfyAffordableTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[2]")
    public MobileElement VfyAffordable_subTxt;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@index, '1')]")
    public MobileElement ClickStartBtn;
    
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Skip']")
    public MobileElement BtnSkip_Affordable;

    
    // Inclusive Content Page's Object Repositories
    
    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public MobileElement VfyInclusiveImage;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Inclusive']")
    public MobileElement VfyInclusiveTxt;
    
    @AndroidFindBy(xpath ="//android.widget.TextView[2]")
    public MobileElement VfyInclusiveSubTxt;
    
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Skip']")
    public MobileElement BtnSkip_Incklusive;
    
    
// Hygenic and Safe Content Page's Object Repositories
    
    @AndroidFindBy(xpath = "//android.widget.ImageView")
    public MobileElement VfyHygSafeImage;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hygienic and Safe']")
    public MobileElement VfyHygSafeTxt;
    
    @AndroidFindBy(xpath ="//android.widget.TextView[2]")
    public MobileElement VfyHygSafeSubTxt;
    
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Next']")
    public MobileElement BtnNext_HygSafe;
    
  
}

