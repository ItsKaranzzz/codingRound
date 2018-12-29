package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonFunctions;

public class HotelBookingPage {

	@FindBy(linkText = "Hotels")
	private WebElement hotelLink;

	@FindBy(id = "Tags")
	private WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	private WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	private WebElement travellerSelection;

	public HotelBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickonHotelLink() {
		CommonFunctions.clickOnElement(hotelLink);
	}

	public void enterLocality(String locality) {
		CommonFunctions.enterOntoElement(localityTextBox, locality);
	}

	public void optFortravelselction(String travelSelect) {
		CommonFunctions.selectElementOnDropdown(travellerSelection, travelSelect);
	}

	public boolean checkForSearchBtn() {
		return searchButton.isEnabled();
	}
}