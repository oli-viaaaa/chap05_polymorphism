package com.javalab.polymorphism.pkg16;

/*
 * 추상클래스 구현 클래스(자식 클래스)
 * 부모의 추상 메소드 중에서 하나라도 구현 안하면 자신도 추상클래스가 되어야 함.
 * 추상메소드가 하나라도 있으면 그 클래스는 추상클래스가 되어야 함. 
 * 예를 들어서 stop() 메소드를 구현하지 않으면 이 클래스도 추상크래스가 되어야 함.
 * 추상메소드가 하나라도 있으면 그 클래스는 추상클래스가 되어야 함. 
 */

public class Bus implements Vehicle{
	// 추상메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 정류장에서 손님을 태우고 운행중 입니다.");	
	}


}
