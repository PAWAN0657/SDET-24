package Listener;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actiTime.generics.BaseClass;

@Listeners(Listener.ListenerImplementation.class)////packagename.classname.class
public class CustomerModule extends BaseClass  {
@Test
public void testCreateCustomer() {
Reporter.log("testCreateCustomer",true);
Assert.fail();
}
}