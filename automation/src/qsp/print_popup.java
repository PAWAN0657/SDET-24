package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class print_popup {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}	
	public static void main(String[] args) throws InterruptedException, AWTException{
		WebDriver w=new FirefoxDriver();
        w.get("https://www.google.com/");
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(4444);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_3);
        }}