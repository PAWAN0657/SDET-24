package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_handlingmultipleelement {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/multiple%20element.html");
List<WebElement> allLinks = w.findElements(By.xpath("//a"));
int count = allLinks.size();
System.out.println(count);

for(int i=0;i<count;i++)
{
WebElement link = allLinks.get(i);
String text = link.getText();
System.out.println(text);
}
////String text=allLinks.get(0).getText();///alternate way shortway

w.close();
}}
