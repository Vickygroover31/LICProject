package com.LICinsurance.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LICinsurance.Baseclass.Baseclass;

public class Locators extends Baseclass {
	
	public Locators() {
		PageFactory.initElements(Baseclass.driver, this);	
	}

	@FindBy(xpath="//span[text()=' Products']")
	private WebElement product;
	
	@FindBy(xpath="//a[text()='Insurance Plans']")
	private WebElement plan;
	
	@FindBy(xpath="//a[text()='Money Back Plans']")
	private WebElement moneyPlan;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-sjeevanumang-745%09512n312v03']")
	private WebElement jeevanPlan;
	
	@FindBy(xpath="//a[text()=' Sales Brochures ']")
	private WebElement sales;
	
	@FindBy(xpath="//a[text()='Pension Plans']")
	private WebElement pensionPlan;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-s-new-pension-plus-867-512l347v01']")
	private WebElement pensionPlus;
	
	@FindBy(xpath="//a[text()=' Policy Document ']")
	private WebElement policyDocument;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-sjeevanakshay-vii-857-512n337v061']")
	private WebElement jeevanAkshay;
	
	@FindBy(xpath="//a[text()=' Sales Brochure ']")
	private WebElement salesBrochure;
	
	@FindBy(xpath="//a[text()='Unit Linked Plans']")
	private WebElement unitPlans;
	
	@FindBy(xpath="//a[@href='/en/web/guest/lic-s-index-plus-873-512l354v01']")
	private WebElement indexPlus;
	
	@FindBy(xpath=" //a[text()=' Sales Brochures '] ")
	private WebElement sale;

	@FindBy(xpath="//a[text()='Health Plans']")
	private WebElement health;
	
	@FindBy(xpath="//a[text()='Health Claim Forms for Policyholders']")
	private WebElement healthClaim;
	
//	@FindBy(xpath="//a[@href='/documents/20121/119772/020816-claimform.pdf/12da5c5a-4481-3906-dcec-9aa14d5fb9b3?t=1669182138547']")
//	private WebElement claim;
//	
//
//	public WebElement getClaim() {
//		return claim;
//	}

	public WebElement getHealth() {
		return health;
	}

	public WebElement getHealthClaim() {
		return healthClaim;
	}

	

	public WebElement getUnitPlans() {
		return unitPlans;
	}

	public WebElement getIndexPlus() {
		return indexPlus;
	}

	public WebElement getSale() {
		return sale;
	}

	public WebElement getJeevanAkshay() {
		return jeevanAkshay;
	}
	
	public WebElement getSalesBrochure() {
		return salesBrochure;
	}

	

	public WebElement getPensionPlan() {
		return pensionPlan;
	}

	public WebElement getPensionPlus() {
		return pensionPlus;
	}

	public WebElement getPolicyDocument() {
		return policyDocument;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getPlan() {
		return plan;
	}

	public WebElement getMoneyPlan() {
		return moneyPlan;
	}

	public WebElement getJeevanPlan() {
		return jeevanPlan;
	}

	public WebElement getSales() {
		return sales;
	}

}
