package testCases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SearchResultPage;
import resources.base;

public class ValidateSearchResult extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized!");

		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page!");
	}

	@Test
	public void SearchRestaurants() throws IOException, InterruptedException {

		// Enter the postcode "AR51 1AA" and search the restaurants in this area.
		LandingPage ldp = new LandingPage(driver);
		ldp.getSearchBar().sendKeys("AR51 1AA");
		ldp.getSearchBtn().click();

		// Thread.sleep(3000);
		SearchResultPage srp = new SearchResultPage(driver);

		// Verify the location is "AR51
		Assert.assertEquals(srp.locationHeader().getText(), "AR51 1AA, Area51");
		log.info("Successfully validated The Location of Restaurants!");

		int foo = Integer.parseInt(srp.openRestaurants().getText().split(" ")[0]);

		// Verify the number of found restaurants are great than 0 and display the
		// number in console and log
		assertTrue(foo > 0);
		System.out.println("Successfully Seen " + foo + " Restaurants in \"AR51 1AA\"!");
		log.info("Successfully Seen " + foo + " Restaurants in \"AR51 1AA\"!");

	}

	@AfterTest
	public void teardown() {
		System.out.println(driver.getTitle());
		driver.close();
	}

}
