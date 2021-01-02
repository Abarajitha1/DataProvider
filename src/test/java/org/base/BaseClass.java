package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public void loadUrl(String data) {

		driver.get(data);

	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void clickBtn(WebElement element) {
		element.click();

	}

	public void close() {
		driver.close();
	}
	
	private void deven() {
		// TODO Auto-generated method stub

	}

}
