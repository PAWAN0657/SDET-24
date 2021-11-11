package qsp;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class click_all_checkbox{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}	

public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver w=new ChromeDriver();
	w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	System.out.println("enter url");
	Scanner sc=new Scanner(System.in);
	String url = sc.nextLine();
	w.get(url);
	List<WebElement> allcheckbox = w.findElements(By.xpath("//input[@type='checkbox']"));
	///Collections.reverse(allcheckbox);
	Thread.sleep(4000);
	for (WebElement w1 : allcheckbox) {
		w1.click();
	}
	
	         
	

}}
