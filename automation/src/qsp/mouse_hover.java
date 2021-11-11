package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.vtiger.com/");
		w.manage().window().maximize();
		WebElement resource = w.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle text-dark'])[3]"));
        Actions a=new Actions(w);
        a.moveToElement(resource).perform();
        w.findElement(By.xpath("//a[contains(text(),' Contact ')]")).click();
        String phoneno = w.findElement(By.xpath("(//p[@class='mb-1'])[1]/..//p[2]")).getText();
        System.out.println(phoneno);
        w.close();
	}}