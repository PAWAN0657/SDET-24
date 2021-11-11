package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class naukri {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	ChromeDriver c=new ChromeDriver();
	c.navigate().to("https://www.naukri.com/");
	c.close();//it will close current browser
	c.quit();//it will close all browsers
}
}
