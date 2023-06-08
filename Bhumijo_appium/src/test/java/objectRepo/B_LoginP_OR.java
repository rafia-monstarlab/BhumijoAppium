package objectRepo;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class B_LoginP_OR {
	
	public B_LoginP_OR(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
	public MobileElement VfyLoginHeaderTxt;
	
	@AndroidFindBy(xpath = "//android.view.View[@index, '0']")
	public MobileElement VfyPhoneNumberFld;
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc='Icon']")
	public MobileElement VfyPhoneIcon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Phone']")
	public MobileElement VfyPhoneFldPlaceholder;
	
	@AndroidFindBy(xpath="//android.view.View")
	public MobileElement VfyVerificationBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Send Verification Code']")
	public MobileElement VfyVerificationBtnTxt;
	
	@AndroidFindBy(xpath="//android.widget.EditText")
	public MobileElement SendPhoneNo;
	
	

}
