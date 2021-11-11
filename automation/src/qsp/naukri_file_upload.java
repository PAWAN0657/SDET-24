package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_file_upload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.get("https://my.naukri.com/account/register/basicdetails?sid=");
		Thread.sleep(4444);
		w.findElement(By.xpath("//button[@class='action-btn exp']")).click();
		Thread.sleep(4444);
		File f=new File("./data/resume.docx");
		String a= f.getAbsolutePath();
		w.findElement(By.xpath("//input[@class=' clicked']")).sendKeys(a);
		}}
		