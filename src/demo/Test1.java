package demo;

import sandeep.Module2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Example of accessing the method of a different Jar");
		greetMessage();
		Module2.displayMessage();
		
	}
	public static void greetMessage()
	{
		System.out.println("greetings from Test1 class");
	}

}