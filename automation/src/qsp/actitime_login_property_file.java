package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class actitime_login_property_file{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}	

public static void main(String[] args) throws IOException {
	WebDriver w=new ChromeDriver();
	w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	FileInputStream f=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(f);
	String url = p.getProperty("url");
	w.get(url);
	String uname = p.getProperty("username");
	String pwd = p.getProperty("password");
	w.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
	w.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	w.findElement(By.xpath("//div[.='Login ']")).click();
	}
}
