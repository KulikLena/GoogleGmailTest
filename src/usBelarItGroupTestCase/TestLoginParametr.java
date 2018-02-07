package usBelarItGroupTestCase;

public class TestLoginParametr {
	public String login = "";
	public String passwword = "";

	public TestLoginParametr(String str) {
		String[] st = str.split(",");
		this.login = st[0];
		this.passwword = st[1];
	}

}
