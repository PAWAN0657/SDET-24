package Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void verifyTitle() {
WebDriver w=new ChromeDriver();
w.get("https://www.google.com/");
String expectedtitle = "Google";
String actualtitle = w.getTitle();
Assert.assertEquals(actualtitle, expectedtitle);
w.close();
}
}
