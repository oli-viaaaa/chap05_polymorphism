package com.javalab.polymorphism.pkg16;

public class VehicleMain {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		Vehicle ve;

		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용==============");
		// Bus 객체 생성하고 인터페이스 변수에 대입
		ve = new Bus();
		ve.run();

		// Taxi 객체 생성하고 인터페이스 변수에 대입
		ve = new Taxi();
		ve.run();

		System.out.println();
		System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현=======");
		Vehicle vehicle = new Bus();
		Vehicle vehicle2 = new Taxi();
		Bus bus = (Bus) vehicle;
		Taxi taxi = (Taxi) vehicle2;
		bus.run();
		taxi.run();

		System.out.println();
		System.out.println("[3] 반복문을 통해서 운행을 자동화 시킴==============");
		Vehicle[] veArr = new Vehicle[2];
		veArr[0] = new Bus();// 자동 타입변환
		veArr[1] = new Taxi();

		for (Vehicle vehicle3 : veArr) {
			vehicle3.run();
		}

	}

}
