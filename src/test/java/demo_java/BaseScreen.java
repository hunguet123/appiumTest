package demo_java;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.*;

public class BaseScreen extends ExtentReport {
    protected AndroidDriver<MobileElement> driver;

    public BaseScreen() {
        DesiredCapabilities cap = new DesiredCapabilities();
        
        cap.setCapability("deviceName", "sdk_gphone64_arm64");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("appPackage", "com.example.chatappfirebase");
        cap.setCapability("appActivity", "com.example.chatappfirebase.MainActivity");

        //report
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("AppiumTest.html");
        extent.attachReporter(spark);

        URL url;
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub");
            this.driver = new AndroidDriver<MobileElement>(url, cap);
            System.out.println("Appium running ...");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}