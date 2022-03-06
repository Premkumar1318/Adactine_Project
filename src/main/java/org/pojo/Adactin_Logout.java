package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Logout {
	public static WebDriver driver; // null driver

	@FindBy(id = "logout")
	private WebElement logout;

	public Adactin_Logout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

}
