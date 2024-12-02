package com.LICinsurance.stepdefinition;

import com.LICinsurance.Baseclass.Baseclass;
import com.LICinsurance.ObjectRepository.Locators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productmodule extends Baseclass {
	Baseclass base =new Baseclass();
	Locators locator = new Locators();
	
	
	
	
	@Given("User launches thhe insurance application {string}")
	public void user_launches_thhe_insurance_application(String url) {
		base.launchApplication(url);
	}

	@Then("User validates the launched application   {string}")
	public void user_validates_the_launched_application(String url) {
		String currentUrl = base.currentUrl();
		System.out.println(currentUrl);
		if(currentUrl.startsWith(url)) {
			System.out.println("Application is Launched Successfully");	
		}
		else {
			System.out.println("Application is not launched successfully");
		}
	   
	}

	@When("User clicks on product module")
	public void user_clicks_on_product_module() {
		try {
			base.ss("product");
		    base.mouseOver(locator.getProduct());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@When("User clicks on Insurance plans")
	public void user_clicks_on_Insurance_plans() {
		try {
		base.mouseOver(locator.getPlan());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

	@When("User clicks on Money back plans")
	public void user_clicks_on_Money_back_plans() {
		try {
		base.button(locator.getMoneyPlan());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Then("User Selects LIC Jeevan Umang plan")
	public void user_Selects_LIC_Jeevan_Umang_plan() {
		try {
		base.button(locator.getJeevanPlan()); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("User validates the sales brochure")
	public void user_validates_the_sales_brochure() {
		try {
		base.ss("sales");
		base.button(locator.getSales());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	  
	}
	

	@When("User click on products")
	public void user_click_on_products() {
		try {
		base.mouseOver(locator.getProduct());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	 
	}

	@When("User click on pension plans")
	public void user_click_on_pension_plans() {
		try {
		base.button(locator.getPensionPlan());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

	@When("User clicks on LIC new pension plus")
	public void user_clicks_on_LIC_new_pension_plus() {
		try {
		base.button(locator.getPensionPlus());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

	@Then("User selects the policy documents")
	public void user_selects_the_policy_documents() {
		try {
		base.button(locator.getPolicyDocument());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

	@When("User clicks on product field")
	public void user_clicks_on_product_field() {
		try {
		base.mouseOver(locator.getProduct());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

	@When("User click on Pension plan field")
	public void user_click_on_Pension_plan_field() {
		try {
			base.button(locator.getPensionPlan());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	   
	}

	@When("User selects LIC Jeevan Akshay-II")
	public void user_selects_LIC_Jeevan_Akshay_II() {
		try {
		base.button(locator.getJeevanAkshay());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	  
	}

	@Then("User selects the Sales brochure")
	public void user_selects_the_Sales_brochure() {
		try {
		base.button(locator.getSalesBrochure());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	    
	}

	@When("User clicks on the product fields")
	public void user_clicks_on_the_product_fields() {
		try {
	   base.mouseOver(locator.getProduct());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User clicks on Unit linked plans")
	public void user_clicks_on_Unit_linked_plans() {
		try {
	    base.button(locator.getUnitPlans());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User Selects LIC index plus")
	public void user_Selects_LIC_index_plus() {
		try {
		base.button(locator.getIndexPlus());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	}

	@Then("User selects the sale document")
	public void user_selects_the_sale_document() {
		try {
		base.button(locator.getSale());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	  
	}
	
	@When("User mouseover on the product field")
	public void user_mouseover_on_the_product_field() {
		try {
	    base.mouseOver(locator.getProduct());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("User Selects the Health plans")
	public void user_Selects_the_Health_plans() {
		try {
		base.button(locator.getHealth());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   	}

	@When("User selects the Health claim form")
	public void user_selects_the_Health_claim_form() {
		try {
		base.ss("healthClaim");
	   base.button(locator.getHealthClaim());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("User selects the claim form")
	public void user_selects_the_claim_form() {
	  base.forward();
	    
	}
	


}
