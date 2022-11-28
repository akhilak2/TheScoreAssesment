import org.openqa.selenium.By;
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

    By done=By.id("com.fivemobile.thescore:id/action_button_text");

    By nFLLeauges = By.xpath("//android.widget.FrameLayout[@content-desc=\"Leagues\"]/android.widget.FrameLayout/android.widget.ImageView");

    By myLeagues=By.id("com.fivemobile.thescore:id/navigation_bar_item_small_label_view");

    //leagues title
    By leaguesTitle=By.id("com.fivemobile.thescore:id/titleTextView");

    //Leagues page NFL
    By leaguesNFL= By.id("com.fivemobile.thescore:id/league_name_text");

    //standings locator
    By standings=By.xpath("//android.widget.LinearLayout[@content-desc=\"Standings\"]/android.widget.TextView");

    @Test
    public void basicTest() throws InterruptedException {


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
        wait.until(ExpectedConditions.elementToBeClickable(done)).click();

        Thread.sleep(5000);

        //Click on NFL
        wait.until(ExpectedConditions.visibilityOfElementLocated(nFLLeauges)).click();

        //select My Leagues
        wait.until(ExpectedConditions.visibilityOfElementLocated(myLeagues)).click();

        //Verify that the expected page opens correctly.
        Assert.assertTrue(driver.findElement(leaguesTitle).isDisplayed());

        //Tap on a sub-tab of your choice, eg: league table / standings / leaders, or stats tab of the
        //league, team, or player
        //click on NFL
        wait.until(ExpectedConditions.visibilityOfElementLocated(leaguesNFL)).click();

        //click on standings
        wait.until(ExpectedConditions.visibilityOfElementLocated(standings)).click();

        //Verify that you are on the correct tab and that the data is displayed correctly and
        //corresponds to the league, team, or player from step 1.


    }

}
