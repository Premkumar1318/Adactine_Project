package org.basemethods;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver; // nullDriver

	public static WebDriver getBrowser(String browsertype) {
		if (browsertype.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsertype.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browsertype.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverserver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		} else if (browsertype.equalsIgnoreCase("Microsoft Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void clickonElement(WebElement element) {
		element.click();
	}

	public static void inputtext(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void close() {
		driver.close();
	}

	public static void Sleep_Mode(long ms) throws InterruptedException {
		Thread.sleep(ms);
	}

	public static void Timeout_implicit(int t) {
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	}

	public static void dropDown(WebElement element, String type, String v) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(v);
		} else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(v);
		} else if (type.equalsIgnoreCase("byindex")) {
			int index = Integer.parseInt(v);
			s.selectByIndex(index);
		}

	}

	public static void TakesScreenshot(String pathname) throws IOException {
		org.openqa.selenium.TakesScreenshot ts=(org.openqa.selenium.TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(pathname);
		FileHandler.copy(source, destination);

	}


}
