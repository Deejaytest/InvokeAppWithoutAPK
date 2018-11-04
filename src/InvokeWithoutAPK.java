import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class InvokeWithoutAPK {

	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setCapability("platformName", "ANDROID");
		Cap.setCapability("deviceName", "Moto G4");
		Cap.setCapability("appActivity","com.til.np.activity.NewsPointUserPermissionActivity");
		Cap.setCapability("appPackage","com.til.timesnews");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
	}

}

/* 
 * To get Package name and activity name follow following steps- 
1. Run ‘adb shell’
2. open the app for which you want to find the appPackage and appActivity.
3. Now run this command: dumpsys window windows | grep -E ‘mCurrentFocus’
 */
