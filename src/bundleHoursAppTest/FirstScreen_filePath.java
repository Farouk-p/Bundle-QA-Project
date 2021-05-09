package bundleHoursAppTest;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstScreen_filePath {
	AndroidDriver<WebElement> driver;
	
@BeforeTest
	public void setup() throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
        DesiredCapabilities dc = new DesiredCapabilities();
        // Created object of DesiredCapabilities class.
        
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        // Set android automationName desired capability. Set your device name.
        
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "98892a465432453745");
        // Set android deviceName desired capability. Set your device name.
        
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        // Set platformName desired capability to Android
        
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        // Set Android's OS VERSION @ desired capability.
        
        dc.setCapability("appPackage", "com.bundle.billable_hours_app"); 
        // Set your application's package.
        
        dc.setCapability("appActivity","​com.bundle.billable_hours_app.MainActivity");
        // Set your application's MainActivity.
        
    	URL url = new URL ("http://127.0.0.1:4723/wd/hub");
    	// created object for url class
    	
	driver = new AndroidDriver<WebElement>(url, dc);
	//set appium server details
		
        Thread.sleep(5000);
}
        
        @Test
    	public void inputFilePath() throws InterruptedException { 
        
        WebElement filePathUpload= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        filePathUpload.sendKeys("RW1wbG95ZWUgSUQsQmlsbGFibGUgUmF0ZSAocGVyIGhvdXIpLFByb2plY3QsRGF0ZSxTdGFydCBUaW1lLEVuZCBUaW1lCjEsMzAwLEdvb2dsZSwyMDE5LTA3LTAxLDA5OjAwLDE3OjAwCjIsMTAwLEZhY2Vib29rLDIwMTktMDctMDEsMTE6MDAsMTY6MDA=");
        //input text in the file path field (File path in Base 64)
        
        System.out.println("Input CSV path successfully");
        
        WebElement clickContinue= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
        
        clickContinue.click();
        // click on the continue button
        
        System.out.println("Clicked continue successfully");
        
        Thread.sleep(5000);
        }
        
        @AfterTest
    	public void tearDown() {
    		driver.quit();
    	}
    }
