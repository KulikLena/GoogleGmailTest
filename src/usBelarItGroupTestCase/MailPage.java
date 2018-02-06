package usBelarItGroupTestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MailPage {
	private final WebDriver dr;

	public MailPage(WebDriver dr) {
		this.dr = dr;
	}

	public MailPage sendMail(WebDriver dr, String addressee, String text) {
		dr.findElement(Locators.newLetter).click();

		dr.findElement(Locators.addressee).clear();
		dr.findElement(Locators.addressee).sendKeys(addressee);
		Actions action = new Actions(dr);
		action.moveToElement(dr.findElement(Locators.contactHelp)).doubleClick().perform();

		dr.findElement(Locators.textbox).click();
		dr.findElement(Locators.textbox).clear();
		dr.findElement(Locators.textbox).sendKeys(text);
		dr.findElement(Locators.send).click();
		return this;
	}

	public MailPage checkMail(WebDriver drive) {
		drive.findElement(Locators.incoming).click();
		drive.findElement(Locators.letter).click();
		assertEquals(drive.findElement(Locators.textField).getText(), Parametrs.text);
		return this;
	}

	public MailPage deleteMail(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(Locators.deleteLetter)).click().perform();
		return this;
	}
}
