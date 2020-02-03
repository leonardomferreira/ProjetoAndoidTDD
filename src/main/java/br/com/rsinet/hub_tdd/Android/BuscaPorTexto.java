package br.com.rsinet.hub_tdd.Android;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_tdd.pageObject.Home_Page;
import br.com.rsinet.hub_tdd.utility.Scroll;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BuscaPorTexto {

	private static AndroidDriver driver;
	private static TouchAction action;
	
	@Test
	public void Executa() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("deviceName", "Pixel 2");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9");
        caps.setCapability("chromedriverExecutable", "C:\\ChromeDriver3\\chromedriver.exe");
		caps.setCapability("appPackage", "com.Advantage.aShopping");
		caps.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
       
 
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        action = new TouchAction(driver);
        
        Home_Page.clk_Pesquisa(driver).click();
        Home_Page.clk_Pesquisa(driver).sendKeys("hp");
        Home_Page.clk_Lupa(driver).click();
        Scroll.scrollAndClick(driver, "HP PAVILION 15T TOUCH LAPTOP");
}
}
