package com.javalab.polymorphism.pkg16;

/*
 * 추상 클래스의 구현클래스(자식 클래스)
 */

public class Taxi implements Vehicle {
	// 추상 메소드 재정의
	@Override
	public void run() {
		System.out.println("택시가 거리에서 손님을 태우고 운행중 입니다."); // 메소드 구현부
	}

}
