package qsp;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/upload.html");
		Thread.sleep(4444);
		File f=new File("./data/resume.docx");
		String absolutepath = f.getAbsolutePath();
		w.findElement(By.id("ev")).sendKeys(absolutepath);
		}}