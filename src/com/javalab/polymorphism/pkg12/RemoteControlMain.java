package com.javalab.polymorphism.pkg12;
// 실행클래스
public class RemoteControlMain {

	public static void main(String[] args) {
		
		RemoteControl remoconc; // 리모컨 기능만 있는 인터페이스 타입 변수 선언
		
		// 1. 리모컨 기능만 있는 Televsion 사용
		// 텔레비전 객체 생성해서 인터페이스 타입에 저장
		remoconc = new Television(); // 구현 객체 대입(자동타입 변환)
		remoconc.turnOn(); // 구현 객체의 메소드가 호출
		remoconc.turnOff(); // 구현 객체의 메소드가 호출
		System.out.println();
		
//		Searchable sh = new Television(); // 상속관계가 아닌데 찾아들어감. 오류
//		sh.search("www.naver.com");
		
		// 2. SmartTV를 작동하는 경우
		SmartTelevision sTv = new SmartTelevision();
		//인터페이스 타입 변수에 저장
		RemoteControl remocon2 = sTv; // 자동타입 변환
		Searchable sh = sTv; // 자동 타입 변환
		remocon2.turnOn(); // 구현 객체의 메소드 호출
		remocon2.setVolume(6); // 구현객체의 메소드 호출
		
		sh.search("www.naver.com");
		remocon2.turnOff(); 
		
	}

}
