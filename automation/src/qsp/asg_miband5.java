package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_miband5 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.flipkart.com/search?q=mi+smart+band+5&sid=ajy%2Cq7p&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_15_na_na_ps&otracker1=AS_");
String price = w.findElement(By.xpath("//div[.='Mi Smart Band 5']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();
System.out.println("mi smart band 5 price is "+price);
}}