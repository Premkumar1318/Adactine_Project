package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Search {
	public static WebDriver driver; // null driver

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(name = "room_type")
	private WebElement roomtype;

	@FindBy(name = "room_nos")
	private WebElement roomnos;

	@FindBy(name = "datepick_in")
	private WebElement clear;

	@FindBy(name = "datepick_in")
	private WebElement datein;

	@FindBy(name = "datepick_out")
	private WebElement clear1;

	@FindBy(name = "datepick_out")
	private WebElement dateout;

	@FindBy(name = "adult_room")
	private WebElement adultroom;

	@FindBy(name = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement submit;

	public Adactin_Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getclear() {
		return clear;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getclear1() {
		return clear1;

	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
