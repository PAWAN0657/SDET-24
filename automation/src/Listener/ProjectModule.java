package Listener;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class ProjectModule {
@Test(groups="Smoketest")
public void testCreateCustomer() {
Reporter.log("testCreateCustomer",true);
}

@Test(groups="Smoketest")
public void testDeleteCustomer() {
Reporter.log("testDeleteCustomer",true);
}
}
