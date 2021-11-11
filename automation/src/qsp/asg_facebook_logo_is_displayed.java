package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class asg_facebook_logo_is_displayed 
{
static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	boolean logo = w.findElement(By.xpath("//img[contains(@class,'fb')]")).isDisplayed();
	if(logo==true)
	{
		System.out.println("logo displayed");
	}
	else
	System.out.println("not displayed");	
}}
