package com.java.lambda.test;

public interface TestLambdaInterface {

    public void sum(int a, int b);
    
  //adds a java 8 default method
  	default void sayHello() {
  		System.out.println("Hello there!");
  	}
}
