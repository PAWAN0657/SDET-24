package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c=new ChromeDriver();
		c.navigate().to("https://mega.nz/start");
		Thread.sleep(4444);
		c.navigate().to("https://www.hotstar.com/in");
		Thread.sleep(4444);
		c.navigate().back();
		Thread.sleep(4444);
		c.navigate().forward();
		Thread.sleep(4444);
		c.navigate().refresh();
		Thread.sleep(4444);
		c.close();
	}

}
