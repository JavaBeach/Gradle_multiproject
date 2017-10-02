package main.java.mypackage;

public class IntData {
	
	private StringData sd = new StringData();
	
	public int getIntData() {
		return sd.getStringData().length(); // constantly 6
	}
}
