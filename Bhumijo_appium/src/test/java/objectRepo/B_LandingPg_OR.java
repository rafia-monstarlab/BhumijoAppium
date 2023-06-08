package objectRepo;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class B_LandingPg_OR {
	
	public B_LandingPg_OR(AppiumDriver<MobileElement>driver) {
		try {
			PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
		}catch(Exception e) {
			System.out.println("Rafiat Landing Page Object: "+e);
		}
		
	}
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Welcome to']")
	public MobileElement VerifywelcomeTxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bhumijo']")
	public MobileElement VerifyBhumijoTxt;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Bangla']")
	public MobileElement VerifyBanglaBtnTxt;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text ='ভূমিজতে\nস্বাগতম']")
	public MobileElement VfywelcomeTxtBangla;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text = 'বাংলা']")
	public MobileElement BtnTxtBanglaInBangla;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text = 'ইংরেজি']")
	public MobileElement BtnTxtEnglisInBangla;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='চলুন শুরু করি!']")
	public MobileElement VfyGetStartBtnInBangla;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='English']")
	public MobileElement VerifyEnglishBtnTxt;
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Let's Get Started!\"]")
	public MobileElement VfyGetStartedBtn;
	
	@AndroidFindBy (xpath = "//android.view.View[@index='2']")
	public MobileElement Clicklanguage_Bangla;
	@AndroidFindBy (xpath = "//android.view.View[@index='2']")
	public MobileElement Clicklanguage_English;
	
	@AndroidFindBy (xpath = "//android.widget.Button[contains(@index, '1')]")
	public MobileElement ClickStartBtn;
	
	
	}
