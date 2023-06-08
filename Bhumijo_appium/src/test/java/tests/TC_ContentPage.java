package tests;

import org.testng.annotations.Test;
import actions.AC_ContentPage;

public class TC_ContentPage extends Baseclass {
    private AC_ContentPage infoActions;

    @Test(priority = 1, enabled = true)
    public void checkUI_Affordable() throws InterruptedException {
        infoActions = new AC_ContentPage(driver);

        Thread.sleep(2000);
        infoActions.clickStartButton();
        infoActions.verifyAffordableImage();
        infoActions.verifyAffordableText();
        infoActions.verifyAffordableSubText();
        infoActions.BtnSkip_Affordable();
        infoActions.performSwipeAction();
        System.out.println("---->> Verified Affordable Content");
    }
    
    @Test(priority = 2, enabled = true)
    public void checkUI_Inclusive() throws InterruptedException {
        infoActions = new AC_ContentPage(driver);

        Thread.sleep(2000);
        infoActions.VfyInclusiveImage();
        infoActions.VfyInclusiveTxt();
        infoActions.VfyInclusiveSubTxt();
        infoActions.BtnSkip_Incklusive();
        infoActions.performSwipeAction();
        System.out.println("---->> Verified Inclusive Content");
    }
    
    @Test(priority = 3, enabled = true)
    public void checkUI_Hyg_Safe() throws InterruptedException {
        infoActions = new AC_ContentPage(driver);

        Thread.sleep(2000);
        infoActions.VfyHygSafeImage();
        infoActions.VfyHygSafeTxt();
        infoActions.VfyHygSafeSubTxt();
        infoActions.BtnNext_HygSafe();
        System.out.println("---->> Verified Hygenic & Safe Content");
    }
}
