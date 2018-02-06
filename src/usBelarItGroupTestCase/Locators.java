package usBelarItGroupTestCase;

import org.openqa.selenium.By;

public class Locators {
	public static By mail = By.linkText("Почта");
	public static By loginEmail = By.id("identifierId");
	public static By loginPassword= By.name("password");
	public static By login= By.cssSelector("span.RveJvd.snByac");
	
	public static By newLetter = By.cssSelector("div[gh=cm]");
	public static By addressee = By.cssSelector("textarea[role=combobox]");
	public static By contactHelp = By.cssSelector("div[data-hovercard-id=\"testtest06022018@gmail.com\"]");
	public static By textbox = By.cssSelector("div[role=\"textbox\"]");
	public static By send = By.cssSelector("td[class=\"gU Up\"]");
	
	public static By incoming = By.cssSelector("a[title~=\"Входящие\"]");
	public static By letter = By.cssSelector("span[class=y2]");
	public static By textField = By.xpath("//div[@role=\"list\"]//div[@dir=\"ltr\"]");
	public static By deleteLetter = By.cssSelector("div[act=\"10\"]");
	public static By account = By.cssSelector("a[class=\"gb_b gb_fb gb_R\"]");
	public static By logout = By.partialLinkText("Выйти");
}
