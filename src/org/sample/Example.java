package org.sample;

public class Example {
	

	public  Example(int age) {
		System.out.println(age);
	}
	public Example() {
		System.out.println("Ashok");
	}
	public  Example(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Example e=new Example(10);
		Example e1=new Example("Raj");
		//Example e1=new Example();
	}
 
}
