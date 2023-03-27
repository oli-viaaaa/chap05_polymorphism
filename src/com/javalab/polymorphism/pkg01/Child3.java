package com.javalab.polymorphism.pkg01;

public class Child3 extends Parent {

	@Override // 오버라이딩 검사 역할
	public void showPersonality() {// 부모의 것을 받았지만 프린트할 내용을 변경함
		System.out.println("셋째의 성격은 부모를 닮아 차분합니다.");
	}
}
