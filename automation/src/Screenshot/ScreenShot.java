package Screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
@Test
public void testScreenshot() throws IOException {
WebDriver w=new ChromeDriver();
w.get("https://www.google.com/");
TakesScreenshot t=(TakesScreenshot) w;
//takes screenshot 
File source = t.getScreenshotAs(OutputType.FILE);
//open empty file in current java project under ScreenShot folder
File dest= new File("./ScreenShot/ss.png");
//copy paste the screenshot to required location from ram
FileUtils.copyFile(source, dest);
w.close();
}
}