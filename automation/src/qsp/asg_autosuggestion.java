package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_autosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}
	public static void main(String[] args){
		//open the browser
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		//go to google.com
		w.get("https://www.google.com/");
		
		//type java in search textbox
		w.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		
		//find all the autosuggestions and print the count
		List<WebElement> allsugg = w.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsugg.size();
		System.out.println(count);
		
		//print all the autosuggestions
		//for(int i=0;i<count;i++)
		//{
			//String text = allsugg.get(i).getText();
			//System.out.println(text);
		//}
		
		//using for each loop:
		for(WebElement sugg: allsugg)
		{
	        String text = sugg.getText();
			System.out.println(text);
		}
		
		//select the first autosuggestion
		//allsugg.get(0).click();
		
		//select the last suggestion
		allsugg.get(count-1).click();
		w.close();
		}}
		
