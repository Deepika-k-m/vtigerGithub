package Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgHardAssertionPractice2 {
@Test
public void strictLevelComaprision() {
	String expectedName="Radha";
	String actualName="Radha";
	Assert.assertEquals(actualName, expectedName);
//	Assert.assertTrue(actualName.equals(expectedName));
//	Assert.assertFalse(actualName.equals(expectedName));
	System.out.println("Hard Assertion strict level is completed");
}

@Test
public void containsLevelComparision() {
	String a1="Don";
	String a2="London";
	Assert.assertTrue(a2.contains(a1));
	System.out.println("Hard Assertion contains level is completed");

}
}
