package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_SelectHotel {
	public static WebDriver driver; // null driver

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement select;

	@FindBy(id = "continue")
	private WebElement continuebtn;

	public Adactin_SelectHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}


}
