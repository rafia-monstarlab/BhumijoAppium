package tests;

import org.testng.annotations.Test;

import actions.AC_ContentPage;
import actions.AC_LoginPage;

public class TC_LoginPage extends Baseclass{
	
	AC_LoginPage loginAc;
	AC_ContentPage infoAc;
	
	@Test(priority = 1, enabled = true)
    public void checkUI_Login() throws InterruptedException {
		
		loginAc = new AC_LoginPage(driver);
		infoAc = new AC_ContentPage(driver);

        Thread.sleep(2000);
        infoAc.clickStartButton();
        infoAc.ClickSkip_Affordable();
        loginAc.VfyLoginHeaderTxt();
        loginAc.VfyPhoneNumberFld();
        loginAc.VfyPhoneIcon();
        loginAc.VfyPhoneFldPlaceholder();
        loginAc.VfyVerificationBtnTxt();
        loginAc.VfyEnableVerificationBtn();
        loginAc.SendPhoneNo();
        loginAc.VfyDisableVerificationBtn();
        System.out.println("---->> Verified Login Page UI");
    }
	
	

}
