package Listener;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class TaskModule {
@Test(groups={"Smoketest","regression"})
public void testCreateCustomer() {
Reporter.log("testCreateCustomer",true);
}
}
