package encapsulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	private WebElement pwdtextbox;
public login(WebDriver driver) {
pwdtextbox = driver.findElement(By.xpath("//input[@name='pwd']"));
}
public void setter(String pwd ) {
	pwdtextbox.sendKeys(pwd);
}
}

