package Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void verifyTitle() {
WebDriver w=new ChromeDriver();
w.get("https://www.google.com/");
String expectedtitle = "Google";
String actualtitle = w.getTitle();
SoftAssert s=new SoftAssert();
s.assertEquals(actualtitle, expectedtitle);
w.close();
s.assertAll();
}
}
