package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import library.Resource;
import objectRepo.B_ContentP_OR;

public class AC_ContentPage {
    AppiumDriver<MobileElement> driver;
    B_ContentP_OR bhumijoPage;

    public AC_ContentPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        bhumijoPage = new B_ContentP_OR(driver);
    }

    public void clickStartButton() {
    	bhumijoPage.ClickStartBtn.click();
        System.out.println("----> Start Button has been clicked");
    }
    
    
    public void verifyAffordableImage() {
    	bhumijoPage.VfyAffordableImage.isDisplayed();
        System.out.println("----> Affordable Image is showing");
    }

    public void verifyAffordableText() {
        String headerTxt = bhumijoPage.VfyAffordableTxt.getText();
        Assert.assertEquals(headerTxt, "Affordable");
        System.out.println("----> Affordable Text is showing");
    }

    public void verifyAffordableSubText() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOf(bhumijoPage.VfyAffordable_subTxt));
        String headerSubTxt = element.getText();
        Assert.assertEquals(headerSubTxt, "Get clean and safe public toilet services at an affordable price.\n");
    }

    public void performSwipeAction() {
        int startX = driver.manage().window().getSize().width * 7 / 8;
        int endX = driver.manage().window().getSize().width / 8;
        int startY = driver.manage().window().getSize().height / 2;
        
        Resource.horizontalSwipeByPercentage(driver, startX, endX, startY);
    }
    
    public void BtnSkip_Affordable() {
    	boolean isClickable = bhumijoPage.BtnSkip_Affordable.isEnabled();
    	System.out.println("Is link clickable? " + isClickable);
    }   
    
    public void ClickSkip_Affordable() {
    	bhumijoPage.BtnSkip_Affordable.click();
    	
    }  
    
   
    public void VfyInclusiveImage() {
    	bhumijoPage.VfyInclusiveImage.isDisplayed();
        System.out.println("----> Inclusive Image is showing");
    }
    
    public void VfyInclusiveTxt() {
        String headerTxt = bhumijoPage.VfyInclusiveTxt.getText();
        Assert.assertEquals(headerTxt, "Inclusive");
    }  
    
    public void VfyInclusiveSubTxt() {
        String headerSubTxt = bhumijoPage.VfyInclusiveSubTxt.getText();
        Assert.assertEquals(headerSubTxt, "Explore safe, well maintained and inclusive toilet that cater the need of women, children, transgender and elderly.\n");
    } 
    
    public void BtnSkip_Incklusive() {
    	boolean isClickable = bhumijoPage.BtnSkip_Incklusive.isEnabled();
    	System.out.println("Is link clickable? " + isClickable);
    }


    public void VfyHygSafeImage() {
    	bhumijoPage.VfyHygSafeImage.isDisplayed();
        System.out.println("----> Inclusive Image is showing");
    }
    
    public void VfyHygSafeTxt() {
        String headerTxt = bhumijoPage.VfyHygSafeTxt.getText();
        Assert.assertEquals(headerTxt, "Hygienic and Safe");
    }  
  
    public void VfyHygSafeSubTxt() {
        String headerSubTxt = bhumijoPage.VfyHygSafeSubTxt.getText();
        Assert.assertEquals(headerSubTxt, "Experience the cleanest and safest public toilet services in town.\n");
    } 
    
    public void BtnNext_HygSafe() {
    	boolean isClickable = bhumijoPage.BtnNext_HygSafe.isEnabled();
    	System.out.println("Is link clickable? " + isClickable);
    } 

}
