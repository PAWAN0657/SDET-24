package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect_multiple_list_box {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/Food.html");
		WebElement slvlistbox = w.findElement(By.id("slv"));
		Select s=new Select(slvlistbox);
	    s.selectByIndex(0);
		WebElement firstoption = s.getFirstSelectedOption();
		String text1 = firstoption.getText();
		System.out.println(text1);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		int count = alloptions.size();
		System.out.println(count);
		//for(int i=0;i<count;i++)
		//{
			//String text2 = alloption.get(i).getText();
			//System.out.println(text2);
			//}
		for(WebElement w1: alloptions)
		{
			System.out.println(w1.getText());
		}
	List<WebElement> alloptions1 = s.getOptions();
	
	for(WebElement w3: alloptions1)
	{
		System.out.println(w3.getText());
	}
	w.close();
	}
	}
