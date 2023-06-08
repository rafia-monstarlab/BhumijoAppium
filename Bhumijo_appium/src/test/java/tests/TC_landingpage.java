package tests;

import org.testng.annotations.Test;

import actions.AC_ContentPage;
import actions.AC_LandingPage;

public class TC_landingpage extends Baseclass {
	 AC_LandingPage landingAc;
	 AC_ContentPage infoAc;
	
    @Test(priority = 1, enabled = true)
    public void checkUI_EnglishLandingP() throws InterruptedException {
    	landingAc = new AC_LandingPage(driver);

        Thread.sleep(2000);
        landingAc.VfywelcomeTxt();
        landingAc.VfyBanglaBtnTxt();
        landingAc.VfyBhumijoTxt();
        landingAc.VfyBanglaBtnTxt();
        landingAc.VfyEnglishBtnTxt();
        System.out.println("---->> Verified UI Landing");
    }
    
    @Test(priority = 2, enabled = true)
    public void checkUI_BanglaLandingP() throws InterruptedException {
    	landingAc = new AC_LandingPage(driver);
    	infoAc = new AC_ContentPage(driver);
    	
        Thread.sleep(2000);
        landingAc.ClickBanglalanguage();
    	landingAc.VfywelcomeTxtBangla();
    	landingAc.VfyBanglabtnInBangla();
    	landingAc.VfyEnglishbtnInBangla();
    	landingAc.VfyGetStartBtnInBangla();
        System.out.println("---->> Verified Bangla UI Landing Page");
        
        landingAc.ClickEnglishlanguage();
        landingAc.ClickStartBtn();
        infoAc.verifyAffordableText();
    }


}
