package test.java.mypackage;

import org.junit.Assert;
import org.junit.Test;

import main.java.mypackage.StartApp;

public class TestStarting {
	
	@Test
	public void testMessageData() {
		Assert.assertEquals("hello!6", new StartApp().getMessage());
	}
}
