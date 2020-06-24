package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By title = By.xpath("//h1[@class='title']");
	By searchBar = By.xpath("//input[@name='postcode']");
	By searchBtn = By.xpath("//button[@type='submit']/span");

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getSearchBar() {
		return driver.findElement(searchBar);
	}

	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}

}
