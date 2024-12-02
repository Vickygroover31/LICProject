package com.LICinsurance.Baseclass;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass implements IBaseclass {
	 public static WebDriver driver;
	 public static Actions action;
	 public Wait wait;
	 public JavascriptExecutor js;
	 

	@Override
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		option.addArguments("start-maximized");
		driver = new EdgeDriver(option);
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		
	}



	@Override
	public void launchApplication(String Url) {
		driver.get(Url);
		
	}

	@Override
	public String currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}

	@Override
	public void button(WebElement ele) {
		ele.click();
		
	}

	@Override
	public void mouseOver(WebElement ele) {
		action.moveToElement(ele).build().perform();
		
	}

	@Override
	public void waits(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

	@Override
	public void forward() {
		driver.navigate().forward();
		
	}

	@Override
	public void ss(String imgName) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\MJ\\eclipse-workspace\\list\\InsuranceProject\\target\\"+imgName+".png");
		try {
			FileUtils.copyFile(source, f);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}





}
