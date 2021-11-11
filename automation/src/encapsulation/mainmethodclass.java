package encapsulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mainmethodclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
public void validlogin(){
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
login l=new login(driver);
l.setter("manager");
}
}
