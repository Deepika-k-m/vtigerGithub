package Sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgSoftAssertionPractice {
@Test
public void strictLevelComparision() {
	String a1="hello";
	String a2="hello";
	SoftAssert s=new SoftAssert();
	s.assertEquals(a2, a1);
	System.out.println("Soft assertion strict level completed");
	s.assertTrue(a2.equals(a1));
	s.assertAll();
	System.out.println("After assert all");
}

@Test
public void COntainsLEvelCOmaprision() {
	String expactedCity="Delhi";
	String actualCity="New Delhi";
	SoftAssert s=new SoftAssert();
	s.assertTrue(actualCity.contains(expactedCity));
	s.assertAll();
	System.out.println("Soft assertion contains level completed");

}
}
