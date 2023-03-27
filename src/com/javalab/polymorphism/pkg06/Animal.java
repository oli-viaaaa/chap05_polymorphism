package com.javalab.polymorphism.pkg06;
	//abstract 추상 클래스 : 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드를 의미
public abstract class Animal {
	// 메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 선언
	public abstract void sound();

}
