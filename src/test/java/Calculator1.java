import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Calculator1 {
    public static void main(String[] args) throws MalformedURLException {
         DesiredCapabilities caps = new DesiredCapabilities();
         caps.setCapability("deviceName", "vivo 1902");
         caps.setCapability("udid", "QKY9RCZ9U8NBJRRC");
         caps.setCapability("platformName", "Android");
         caps.setCapability("platformVersion", "9");
         caps.setCapability("appPackage", "com.android.bbkcalculator4.5");
         caps.setCapability("appActivity", "com.android.bbkcalculator.CalculatorCalculator");
         caps.setCapability("noReset", "true");

         AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

    }
}
