package com.LICinsurance.Baseclass;

import org.openqa.selenium.WebElement;

public interface IBaseclass {
	public void browserLaunch();
	public void launchApplication(String Url);
	public String currentUrl();
	public void button(WebElement ele);
	public void mouseOver(WebElement ele);
	public void waits(WebElement ele);
	public void forward();
	public void ss(String imgName);

}
