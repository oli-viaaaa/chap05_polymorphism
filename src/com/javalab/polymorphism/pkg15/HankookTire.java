package com.javalab.polymorphism.pkg15;

// 구현 클래스(한국 타이어)
public class HankookTire implements Tire {
	// 추상 메소드 재정의(오버라이딩)
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}

}
