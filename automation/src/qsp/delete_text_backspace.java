package qsp;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class delete_text_backspace{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}	

public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver w=new ChromeDriver();
	w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	w.get("http://demo.opensourcebilling.org/en/users/sign_in");
	w.findElement(By.xpath("//input[@id='email']")).click();
	w.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.LEFT_CONTROL+"A"+Keys.ARROW_DOWN);
	String username = "demo@opensourcebilling.org";
	int length = username.length();
	
	for (int i = 0; i <length; i++) {
		w.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.BACK_SPACE);
	}
	
}}
