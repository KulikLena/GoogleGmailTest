package usBelarItGroupTestCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class SendAMail {
	private WebDriver driverOpera;
	private StringBuffer verificationErrors = new StringBuffer();
	private MailPage pageObj;

	@BeforeTest(alwaysRun = true)
	public void setUp() throws Exception {
		OperaOptions operaOptions = new OperaOptions();
		operaOptions.setBinary("c:\\Program Files\\Opera\\49.0.2725.64\\opera.exe");
		System.setProperty("webdriver.opera.driver", "d:\\operadriver.exe");
		driverOpera = new OperaDriver(operaOptions);
	}

	@BeforeClass
	public void setUpPage() {
		pageObj = new MailPage(driverOpera);
		driverOpera.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test (groups = "Critical")
	public void testUntitled() throws Exception {
		driverOpera.get(Parametrs.baseUrl);
		HelpMethods.insertNamePassword(Parametrs.email, Parametrs.password, driverOpera);

		pageObj.sendMail(driverOpera, Parametrs.addressee, Parametrs.text);

		pageObj.checkMail(driverOpera);

		//read.sleep(3000);

		pageObj.deleteMail(driverOpera);

			}

	@AfterClass
	public void tearDownLogin() {
		HelpMethods.logout(driverOpera);
	}

	@AfterTest(alwaysRun = true)
	public void tearDown() throws Exception {
		driverOpera.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
