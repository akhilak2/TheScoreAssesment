import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Base {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;
    public Properties prop;

        @BeforeSuite
        public void setup() throws IOException {
            DesiredCapabilities caps = new DesiredCapabilities();
            prop=new Properties();
            prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"//src//test//java//config.properties")));
            caps.setCapability("deviceName", prop.get("deviceName"));
            caps.setCapability("udid", prop.get("udid")); //DeviceId from "adb devices" command
            caps.setCapability("platformName", prop.get("platformName"));
            caps.setCapability("platformVersion", prop.get("platformVersion"));
            caps.setCapability("skipUnlock", prop.get("skipUnlock"));
            caps.setCapability("appPackage", prop.get("appPackage"));
            caps.setCapability("appActivity", prop.get("appActivity"));
            caps.setCapability("noReset", prop.get("noReset"));
            driver = new AndroidDriver<MobileElement>(new URL(prop.get("hub").toString()), caps);
            wait = new WebDriverWait(driver, 30);
        }

        @AfterSuite
        public void teardown() {
            driver.quit();
        }
}
