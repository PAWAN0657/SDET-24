package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_hrx_8th_element {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.myntra.com/hrx?f=Categories%3ATshirts%3A%3AGender%3Amen%2Cmen%20women&plaEnabled=false");
	String price = w.findElement(By.xpath("(//h3[@class='product-brand'])[8]/../div/span[1]/span[1]")).getText();
	System.out.println(price);
}}