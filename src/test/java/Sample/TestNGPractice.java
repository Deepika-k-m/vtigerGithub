package Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGPractice {
        @Test(priority = 1, invocationCount = 3)
        public void createUser()
        {
        	System.out.println("User created");
        }
        
        @Test(priority = 2, dependsOnMethods = {"createUser"})
        public void modifyUser()
        {
        	System.out.println("User modified");
        }
        @Ignore
        @Test(priority = 1)
        public void deleteUser()
        {
        	System.out.println("User deleted");
        }
}
