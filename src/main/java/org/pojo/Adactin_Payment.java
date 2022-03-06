package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Payment {
	public static WebDriver driver; // null driver

	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement cardno;

	@FindBy(name = "cc_type")
	private WebElement cardtype;

	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(name = "cc_exp_year")
	private WebElement expyear;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(name = "book_now")
	private WebElement booknow;

	public Adactin_Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}


}
