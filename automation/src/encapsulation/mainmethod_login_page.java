package encapsulation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mainmethod_login_page {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void validLogin() {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
login_page l=new login_page(driver);
l.setterUN("admin");
l.setterPWD("manager");
l.setterLOGIN();
}
}
