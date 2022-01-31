package base;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Preference").click();
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		driver.findElementByClassName("android.widget.CheckBox").click();
		driver.findElementByXPath("//android.widget.TextView[@text = 'WiFi settings']").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello World");
		driver.findElementByXPath("//android.widget.Button[@text = 'OK']").click();
	}
	
}