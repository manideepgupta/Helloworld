package com.nareshit.core;

public class MethodSignature {
	public void foo(){
		System.out.println("foo() no args");
	}
	public void fooBar(int a, int b){
		System.out.println("fooBar(-,-)");
	}
	public void fooStart(MethodSignature ms){
		System.out.println("fooStart(-)");
	}

}
