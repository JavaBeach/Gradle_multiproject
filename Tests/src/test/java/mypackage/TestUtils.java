package test.java.mypackage;

import org.junit.Assert;
import org.junit.Test;

import main.java.mypackage.IntData;

public class TestUtils {
	
	@Test
	public void testIntData() {
		Assert.assertEquals(6, new IntData().getIntData());
	}
}
