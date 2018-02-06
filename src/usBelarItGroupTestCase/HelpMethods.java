package usBelarItGroupTestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HelpMethods {
	public static void insertNamePassword(String email, String password, WebDriver dr) {
		dr.findElement(Locators.mail).click();
		dr.findElement(Locators.loginEmail).click();
		dr.findElement(Locators.loginEmail).clear();
		dr.findElement(Locators.loginEmail).sendKeys(email);
		dr.findElement(Locators.login).click();
		new WebDriverWait(dr, 30)
		.until(ExpectedConditions.visibilityOfElementLocated(Locators.loginPassword));
		dr.findElement(Locators.loginPassword).click();
		dr.findElement(Locators.loginPassword).clear();
		dr.findElement(Locators.loginPassword).sendKeys(password);
		dr.findElement(Locators.login).click();
	}

	public static void logout(WebDriver drv) {
		drv.findElement(Locators.account).click();
		drv.findElement(Locators.logout).click();
	}
}
