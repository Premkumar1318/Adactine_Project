package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Payconfirm {
	public static WebDriver driver;

	@FindBy(name = "my_itinerary")
	private WebElement Itinerary;

	public Adactin_Payconfirm(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return Itinerary;
	}

}
