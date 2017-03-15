package com.java.lambda.test;

public class TestLambda implements TestLambdaInterface{

    public static void main(String[] args) {
	
	sumValue((a,b) -> {int sum=a+b;System.out.println("sum="+ sum);},10,20);
	
	TestLambda testLambdaInterface =new TestLambda();
	testLambdaInterface.sayHello();
    }
private static void sumValue(TestLambdaInterface lmd, int a, int b){
    lmd.sum(a, b);
}
@Override
public void sum(int a, int b) {
    // TODO Auto-generated method stub
    
}
}
