package br.com.rsinet.hub_tdd.pageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Home_Page {

	private static AndroidDriver driver;
	
	public static MobileElement lnk_Menu(AndroidDriver driver) {
		
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewMenu");
	}
	public static MobileElement lnk_Login(AndroidDriver driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/linearLayoutLogin");
	}
	public static MobileElement clk_CreateAccount(AndroidDriver driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/textViewSingUpToday");
 }
	public static MobileElement clk_Pesquisa(AndroidDriver driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/editTextSearch");

 }
	public static MobileElement clk_Lupa(AndroidDriver driver) {
		return (MobileElement) driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");

}
}