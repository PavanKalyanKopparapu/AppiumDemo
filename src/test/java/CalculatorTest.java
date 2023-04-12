import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    static AppiumDriver<MobileElement> driver;
    public static void main(String[] args){
        try {
            openCalculator();
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

    }
    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","vivo 1902");
        cap.setCapability("udid","QKY9RCZ9U8NBJRRC");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion","9");
        cap.setCapability("appPackage","com.android.bbkcalculator4.5");
        cap.setCapability("appActivity","com.android.bbkcalculator.CalculatorCalculator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        System.out.println("Appilication started....");
    }
}
