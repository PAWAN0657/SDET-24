package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo4 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

}
public static void main(String[] args) {
	WebDriver b=new ChromeDriver();
	remoA.zest(b);
	WebDriver b1=new FirefoxDriver();
	remoA.zest(b1);
	b.manage().window().maximize();
	
	
	
}
}