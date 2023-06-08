package actions;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import objectRepo.B_LandingPg_OR;

public class AC_LandingPage {
	AppiumDriver<MobileElement> driver;
	B_LandingPg_OR bhumijoLanding;
	
	public AC_LandingPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        bhumijoLanding = new B_LandingPg_OR(driver);
    }
	
	
	public void VfywelcomeTxtBangla() {
		bhumijoLanding.VfywelcomeTxtBangla.isDisplayed();
		String welcometxtBangla = bhumijoLanding.VfywelcomeTxtBangla.getText();
		Assert.assertEquals(welcometxtBangla, "ভূমিজতে\nস্বাগতম");
		System.out.println("----> Welcome Text in Bangla Verified");
		
	}
	
	public void VfyBanglabtnInBangla() {
		bhumijoLanding.BtnTxtBanglaInBangla.isDisplayed();
		bhumijoLanding.BtnTxtBanglaInBangla.isSelected();
		String BtnTxtInBangla = bhumijoLanding.BtnTxtBanglaInBangla.getText();
		Assert.assertEquals(BtnTxtInBangla, "বাংলা");
		System.out.println("----> Verifying Button text Bangla is showing in Bangla ");
		}
	
	public void VfyEnglishbtnInBangla() {
		bhumijoLanding.BtnTxtEnglisInBangla.isDisplayed();
		bhumijoLanding.BtnTxtEnglisInBangla.isSelected();
		String EngBtnTxtInBangla = bhumijoLanding.BtnTxtEnglisInBangla.getText();
		Assert.assertEquals(EngBtnTxtInBangla, "ইংরেজি");
		System.out.println("----> Verifying Button text English is showing in Bangla ");
		}
	
	public void VfyGetStartBtnInBangla() {
		bhumijoLanding.VfyGetStartBtnInBangla.isDisplayed();
		bhumijoLanding.VfyGetStartBtnInBangla.isEnabled();
		String StartBtntxtInBangla = bhumijoLanding.VfyGetStartBtnInBangla.getText();
		Assert.assertEquals(StartBtntxtInBangla, "চলুন শুরু করি!");
		System.out.println("----> Let's get started button is displaying");
	}
	
	
	public void VfywelcomeTxt() {
		bhumijoLanding.VerifywelcomeTxt.isDisplayed();
		String welcometxt = bhumijoLanding.VerifywelcomeTxt.getText();
		Assert.assertEquals(welcometxt, "Welcome to");
		System.out.println("----> Welcome Text Verified");
		}
	
	public void VfyBhumijoTxt() {
		bhumijoLanding.VerifyBhumijoTxt.isDisplayed();
		String bhumijotxt = bhumijoLanding.VerifyBhumijoTxt.getText();
		Assert.assertEquals(bhumijotxt, "Bhumijo");
		System.out.println("----> Bhumijo Text Verified");
		}
	
	public void VfyBanglaBtnTxt() {
		bhumijoLanding.VerifyBanglaBtnTxt.isDisplayed();
		bhumijoLanding.VerifyBanglaBtnTxt.isEnabled();
		String BanglaBtntxt = bhumijoLanding.VerifyBanglaBtnTxt.getText();
		Assert.assertEquals(BanglaBtntxt, "Bangla");
		System.out.println("----> Button Text Bangla is displaying");
		}
	
	public void VfyEnglishBtnTxt() {
		bhumijoLanding.VerifyEnglishBtnTxt.isDisplayed();
		bhumijoLanding.VerifyEnglishBtnTxt.isEnabled();
		String EnglishBtntxt = bhumijoLanding.VerifyEnglishBtnTxt.getText();
		Assert.assertEquals(EnglishBtntxt, "English");
		System.out.println("----> Button Text English is displaying");
		}
	
	
	public void VfyGetStartedBtn() {
		bhumijoLanding.VfyGetStartedBtn.isDisplayed();
		bhumijoLanding.VfyGetStartedBtn.isEnabled();
		String StartBtntxt = bhumijoLanding.VfyGetStartedBtn.getText();
		Assert.assertEquals(StartBtntxt, "Let's Get Started!");
		System.out.println("----> Let's get started button is displaying");
	}
	
	
	
	public void ClickEnglishlanguage() {
		bhumijoLanding.Clicklanguage_English.click();
		System.out.println("----> Selected English Language");
	}
	
	public void ClickStartBtn() {
		bhumijoLanding.ClickStartBtn.click();
		System.out.println("----> Start Button Has been clicked");
	}
	
	public void ClickBanglalanguage() {
		bhumijoLanding.Clicklanguage_Bangla.click();
		System.out.println("----> Selected Bangla Language");
	}

}
