package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {

	public WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By locationHeader = By.className("c-locationHeader-title");
	By openRestaurants = By.xpath("//span[contains(text(),'open restaurants')]");
	By submit = By.xpath("//input[@type='submit']");

	public WebElement locationHeader() {
		return driver.findElement(locationHeader);
	}

	public WebElement openRestaurants() {
		return driver.findElement(openRestaurants);
	}

}
