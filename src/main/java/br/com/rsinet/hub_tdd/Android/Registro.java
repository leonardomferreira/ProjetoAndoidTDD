package br.com.rsinet.hub_tdd.Android;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.numeric.NumericPhone;
import br.com.rsinet.hub_tdd.pageObject.Home_Page;
import br.com.rsinet.hub_tdd.pageObject.Register_Page;
import br.com.rsinet.hub_tdd.utility.Scroll;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.offset.PointOption;

public class Registro {

	private static AndroidDriver driver;
	private static TouchAction action;

	@Test
	public void main() throws MalformedURLException, InterruptedException {

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

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.lnk_Home(driver)));
		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.lnk_Menu(driver)));
		Home_Page.lnk_Menu(driver).click();
		Home_Page.lnk_Login(driver).click();
		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.lnk_Login2(driver)));
		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.clk_CreateAccount(driver)));

		Home_Page.clk_CreateAccount(driver).click();

		Register_Page.txtbx_userName(driver).click();
		Register_Page.txtbx_userName(driver).sendKeys("le646");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_Email(driver).click();
		Register_Page.txtbx_Email(driver).sendKeys("leoanrdoe@gmail.com");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_Password(driver).click();
		Register_Page.txtbx_Password(driver).sendKeys("Test@123");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_ConfirmPassword(driver).click();
		Register_Page.txtbx_ConfirmPassword(driver).sendKeys("Test@123");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_FirstName(driver).click();
		Register_Page.txtbx_FirstName(driver).sendKeys("Antonio");
		action.tap(PointOption.point(609, 1030)).perform();

		Register_Page.txtbx_LastName(driver).click();
		Register_Page.txtbx_LastName(driver).sendKeys("Ferreira");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_PhoneNumber(driver).click();
		NumericPhone.Numeric(driver);
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_State(driver).click();
		Register_Page.txtbx_State(driver).sendKeys("Sao sao");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_Address(driver).click();
		Register_Page.txtbx_Address(driver).sendKeys("Rua gglga");
		action.tap(PointOption.point(927, 1686)).perform();
		Register_Page.txtbx_City(driver).click();
		Register_Page.txtbx_City(driver).sendKeys("Osasco");
		action.tap(PointOption.point(735, 1034)).perform();
		Register_Page.txtbx_Zip(driver).sendKeys("04923-392");
		action.tap(PointOption.point(240, 698)).perform();
		Scroll.scrollAndClick(driver, "Brazil");
		Scroll.scrollAndClick(driver, "REGISTER");
		action.tap(PointOption.point(420, 1778)).perform();
	}

}