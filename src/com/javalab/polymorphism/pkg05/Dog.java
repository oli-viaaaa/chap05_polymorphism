package com.javalab.polymorphism.pkg05;

public class Dog extends Animal {

	@Override // 오버라이딩
	public void makeSound() {
		System.out.println("멍멍");
	}
}
