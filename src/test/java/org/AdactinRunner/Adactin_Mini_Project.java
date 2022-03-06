package org.AdactinRunner;

import java.io.IOException;

import org.basemethods.BaseClass;
import org.openqa.selenium.WebDriver;
import org.page_object.Page_Object_Manager;

public class Adactin_Mini_Project extends BaseClass{
	public static WebDriver driver = getBrowser("Chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {

		geturl("https://adactinhotelapp.com/");

		Timeout_implicit(25);
		
        //Login page
		inputtext(pom.getInstanceLogin().getUsername(), "Premkumar1318");
		inputtext(pom.getInstanceLogin().getPassword(), "7094282512");
		
		TakesScreenshot("C:\\Users\\Prem Kumar\\Automation\\Adactin_Project\\Screenshot\\loginpage.png");
		clickonElement(pom.getInstanceLogin().getLogin());
		
        //SearchHotel Page
		dropDown(pom.getInstanceSearch().getLocation(), "byvalue", "London");
		dropDown(pom.getInstanceSearch().getHotels(), "byvalue", "Hotel Sunshine");
		dropDown(pom.getInstanceSearch().getRoomtype(), "byvalue", "Deluxe");
		dropDown(pom.getInstanceSearch().getRoomnos(), "byvalue", "3");
		clear(pom.getInstanceSearch().getclear());
		inputtext(pom.getInstanceSearch().getDatein(), "03/03/2022");
		clear(pom.getInstanceSearch().getclear1());
		inputtext(pom.getInstanceSearch().getDateout(), "06/03/2022");
		dropDown(pom.getInstanceSearch().getAdultroom(), "byvisibletext", "3 - Three");
		dropDown(pom.getInstanceSearch().getChildroom(), "byvisibletext", "3 - Three");
		
		TakesScreenshot("C:\\Users\\Prem Kumar\\Automation\\Adactin_Project\\Screenshot\\searchpage.png");
		clickonElement(pom.getInstanceSearch().getSubmit());
		
        //SelectHotel Page
		clickonElement(pom.getInstanceSelect().getSelect());
		TakesScreenshot("C:\\Users\\Prem Kumar\\Automation\\Adactin_Project\\Screenshot\\selecthotelpage.png");
		clickonElement(pom.getInstanceSelect().getContinuebtn());
		
        //Payment Page
		inputtext(pom.getInstancePay().getFirstname(), "Premkumar");
		inputtext(pom.getInstancePay().getLastname(), "G");
		inputtext(pom.getInstancePay().getAddress(), "Balaji Nagar,Ekkattuthangal,chennai-32");
		inputtext(pom.getInstancePay().getCardno(), "2757887358106673");
		dropDown(pom.getInstancePay().getCardtype(), "byvalue", "MAST");
		dropDown(pom.getInstancePay().getExpmonth(), "byvisibletext", "July");
		dropDown(pom.getInstancePay().getExpyear(), "byvisibletext", "2022");
		inputtext(pom.getInstancePay().getCvv(), "354");
		TakesScreenshot("C:\\Users\\Prem Kumar\\Automation\\Adactin_Project\\Screenshot\\paymentpage.png");
		clickonElement(pom.getInstancePay().getBooknow());
		
        //Payment Confirm Page
		clickonElement(pom.getInstanceConfirm().getItinerary());
		
		TakesScreenshot("C:\\Users\\Prem Kumar\\Automation\\Adactin_Project\\Screenshot\\confirmpage.png");

		//Logout Page
		clickonElement(pom.getInstanceLogout().getLogout());
 
		TakesScreenshot("C:\\Users\\Prem Kumar\\Automation\\Adactin_Project\\Screenshot\\logoutpage.png");
		
		close();

	}

}
