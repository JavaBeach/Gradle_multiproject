package test.java.mypackage;

import org.junit.Assert;
import org.junit.Test;

import main.java.mypackage.StringData;

public class TestFunctions {
	
	@Test
	public void testStringData() {
		Assert.assertEquals("hello!", new StringData().getStringData());
	}
}
