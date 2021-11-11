package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_checkbox_is_selected {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	boolean checkbox = w.findElement(By.xpath("//input[@value='on']")).isSelected();
	if(checkbox==true)
	{
		System.out.println("checkbox is selected");
		}
	else
		System.out.println("checkbox not selected");
}}
