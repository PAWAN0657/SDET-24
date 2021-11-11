package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {
private WebElement usn;
private WebElement pwd;
private WebElement loginbutton;

login_page(WebDriver driver){
	usn=driver.findElement(By.xpath("//input[@name='username']"));
	pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
	loginbutton=driver.findElement(By.xpath("//div[.='Login ']"));
}

public void setterUN(String s1) {
	usn.sendKeys(s1);
}

public void setterPWD(String s2) {
	pwd.sendKeys(s2);
}
	
	public void setterLOGIN() {
		loginbutton.click();
	}
///public void setlogin(String s1,String s2) {
/////usn.sendKeys(s1);
////pwd.sendKeys(s2);
/////loginbutton.click();
}
