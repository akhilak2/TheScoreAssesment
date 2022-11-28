import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_TheScore extends Base {

    //Elements By
    By getStarted=By.id("com.fivemobile.thescore:id/action_button_text");

    By manchesterUnitedStart=By.id("com.fivemobile.thescore:id/follow_icon");

    By continueFavoriteTeam=By.id("com.fivemobile.thescore:id/action_button_text");

    By allowLocation=By.id("com.fivemobile.thescore:id/btn_allow");

    By onlyThisTime=By.id("com.android.permissioncontroller:id/permission_allow_one_time_button");
    //By done= By.id("com.fivemobile.thescore:id/action_button_text");

    By done=By.xpath("//android.view.ViewGroup[@resource-id='com.fivemobile.thescore:id/btn_primary']");

    //Leagues in bottom right
    By leaguesIcon = By.xpath("//android.widget.FrameLayout[@content-desc=\"Leagues\"]/android.widget.FrameLayout/android.widget.ImageView");

    //Leagues page NFL
    By leaguesNFL= By.id("com.fivemobile.thescore:id/league_name_text");

    //leagues title
    By leaguesTitle=By.id("com.fivemobile.thescore:id/titleTextView");

    //standings locator
    By standings=By.xpath("//android.widget.LinearLayout[@content-desc='Standings']/android.widget.TextView");

    //back arrow
    By backArrow=By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");

    //AFC tab
    By aFCTab=By.xpath("//android.widget.LinearLayout[@content-desc=\"AFC\"]/android.widget.TextView");
    @Test
    public void basicTest() {


        //click on get started
        wait.until(ExpectedConditions.visibilityOfElementLocated(getStarted)).click();

        //click on Manchester United Star
        wait.until(ExpectedConditions.visibilityOfElementLocated(manchesterUnitedStart)).click();

        //click on Continue
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueFavoriteTeam)).click();

        //click on allow location
        wait.until(ExpectedConditions.visibilityOfElementLocated(allowLocation)).click();

        //click on only this time
        wait.until(ExpectedConditions.visibilityOfElementLocated(onlyThisTime)).click();

        //click on Done
        wait.until(ExpectedConditions.presenceOfElementLocated(done)).click();

        //Click on NFL
        wait.until(ExpectedConditions.visibilityOfElementLocated(leaguesIcon)).click();

        //Verify that the expected page opens correctly.
        Assert.assertTrue(driver.findElement(leaguesTitle).isDisplayed());

        //select My Leagues
        wait.until(ExpectedConditions.visibilityOfElementLocated(leaguesNFL)).click();

        //Tap on a sub-tab of your choice, eg: league table / standings / leaders, or stats tab of the
        //league, team, or player
        wait.until(ExpectedConditions.visibilityOfElementLocated(standings)).click();

        //Verify that you are on the correct tab and that the data is displayed correctly and
        //corresponds to the league, team, or player from step 1.
        Assert.assertTrue(driver.findElement(aFCTab).isDisplayed());

        //navigate back
        wait.until(ExpectedConditions.visibilityOfElementLocated(backArrow)).click();

        //Verify back os working fine
        Assert.assertTrue(driver.findElement(leaguesTitle).isDisplayed());
    }

}
