package com.javalab.polymorphism.pkg17;

/*
 *  구현 클래스(자식)
 *  	- InterfaceC를 구현한 구현클래스(자식 클래스)
 *  	- InterfaceC는 InterfaceA와 InterfaceB를 상속했음.
 *  메소드의 내용부는 InterfaceCImpl 클래스에 마우스를 가져다 대면 자동으로 구현해줌.
 */

public class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}

}
