@Create
Feature: Creating Insurance plan

Background: User launches the application
Given User launches thhe insurance application "https://licindia.in/en"
Then User validates the launched application   "https://licindia.in/en"

@moneyback
Scenario: Testing the functionality of Money back plans
When User clicks on product module
And User clicks on Insurance plans
And User clicks on Money back plans
Then User Selects LIC Jeevan Umang plan
And User validates the sales brochure

@pensionplan
Scenario: Testing the functionality of Pension plans field1
When User click on products
And User click on pension plans
And User clicks on LIC new pension plus
Then User selects the policy documents

@pensionplan1
Scenario: Testing the functionality of Pension plan field2
When User clicks on product field
And User click on Pension plan field
And User selects LIC Jeevan Akshay-II
Then User selects the Sales brochure

@unitlinkedplan
Scenario: Testing the functionality of Unit linked plans
When User clicks on the product fields
And User clicks on Unit linked plans
And User Selects LIC index plus
Then User selects the sale document

@health
Scenario: Testing the functionality of Health plans
When User mouseover on the product field
And User Selects the Health plans
And User selects the Health claim form
Then User selects the claim form
