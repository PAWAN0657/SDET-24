package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_second_hm_jeans {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.myntra.com/h-and-m-jeans-men?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-h-and-m-jeans-men");
String price = w.findElement(By.xpath("(//h3[@class='product-brand'])[2]/../div/span[1]")).getText();
System.out.println(price);

}}