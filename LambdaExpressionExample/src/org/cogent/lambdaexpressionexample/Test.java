package org.cogent.lambdaexpressionexample;

public class Test {
	
	public static void main(String[] args) {
		//without lambda
		
		Greetable greet = new Greetable() {
			public void greet() {
				
				System.out.println("Hello, how are you");
			}
		};
		
		greet. greet();
		//with lamda
		
		Greetable greet1=()->(System.out.println)(Hello, how are you!!!);};
		
		greet1.greet();

    };
		
			