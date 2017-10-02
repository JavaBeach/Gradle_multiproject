package main.java.mypackage;

public class StartApp {
	
	public String getMessage() {
		return new StringData().getStringData() + new IntData().getIntData(); // hello!6
	}

	public static void main(String[] args) {
		StartApp sa = new StartApp();
		System.out.println(sa.getMessage());
	}
}
