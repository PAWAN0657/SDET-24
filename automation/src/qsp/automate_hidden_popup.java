package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automate_hidden_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);
		w.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		w.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("123");
		w.findElement(By.xpath("//input[@id='dob']")).click();
		WebElement yearlistbox = w.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s=new Select(yearlistbox);
		s.selectByVisibleText("2021");
		WebElement monthlistbox = w.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(monthlistbox);
		s1.selectByVisibleText("Jan");;
		w.findElement(By.xpath("//a[.='12']")).click();
		w.findElement(By.xpath("//input[@id='alternative_number']")).sendKeys("9877955447");
		w.findElement(By.xpath("//button[@id='renew_policy_submit']")).click();
		}}