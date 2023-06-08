package actions;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import objectRepo.B_LoginP_OR;

public class AC_LoginPage {
	
	AppiumDriver<MobileElement> driver;
    B_LoginP_OR bhumijoLoginP;

    public AC_LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        bhumijoLoginP = new B_LoginP_OR(driver);
        
        
    	// Click on Lets Get started
    	// Click on Skip button will redirect to Login page
    	// Verify Login Page UI
    	// Validate Send verification code button is enabled or not
    	// Try to Login to the system with Invalid Phone Number
    	// Verify the error message
    	// Try to Login to the system with Valid Phone Number
        
    }

	public void VfyLoginHeaderTxt() {
		String headerTxt = bhumijoLoginP.VfyLoginHeaderTxt.getText();
        Assert.assertEquals(headerTxt, "Login");
        System.out.println("----> Login Header Text is showing");
	}
	
	public void VfyPhoneNumberFld() {
		
	}
	
	public void VfyPhoneIcon() {
		
	}

	public void VfyPhoneFldPlaceholder() {
	
	}

	public void VfyDisableVerificationBtn() {
	
	}
	
	public void VfyVerificationBtnTxt() {
		
	}
	
	public void VfyEnableVerificationBtn() {
		
	}
	
	public void SendPhoneNo() {
		
	}

}
