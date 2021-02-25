package org.sample;

public class Example {
	

	public  Example(int age) {
		System.out.println(age);
	}
	public Example() {
		System.out.println("Ashok");
	}
	
	public static void main(String[] args) {
		Example e=new Example(10);
		Example e1=new Example();
	}
 
}
