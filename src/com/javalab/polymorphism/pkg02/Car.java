package com.javalab.polymorphism.pkg02;

// Tire 객체를 멤버로 갖는 클래스(필드의 다형성)
public class Car {
	// 필드 선언(타이어 클래스 타입을 필드로 갖게 됨, 어떤 자동차라도 받을 수 있음)
	public Tire tire;

	// 메소드 선언
	public void run() {
		// tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}

}
