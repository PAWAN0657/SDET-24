package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_first_libas_kurta_inmyntra {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.myntra.com/libas-krta");
	String price = w.findElement(By.xpath("(//h3[@class='product-brand'])[1]/../div/span[1]/span[1]")).getText();
System.out.println(price);
}}