package com.javalab.polymorphism.pkg04;

public class DriverMain {
	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// 매개 값으로 Bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();
		driver.driver(bus);
		
		// 매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		Taxi taxi = new Taxi();
		driver.driver(taxi);
		
		// 매개값으로 Truck type 객체를 제공하고 driver() 메소드 호출
		Truck truck = new Truck();
		driver.driver(truck);

	}

}
