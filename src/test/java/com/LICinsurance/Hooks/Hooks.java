package com.LICinsurance.Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.LICinsurance.Baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
Baseclass base = new Baseclass();
	
	@Before
	public void browserLaunch(Scenario scenario) {
		base.browserLaunch();
		final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(source, "image/png");
		
	}
	
	@After
	public void browserClose(Scenario scenario) {
	final byte[] source = ((TakesScreenshot)base.driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(source, "image/png");
	

}
}