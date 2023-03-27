package com.javalab.polymorphism.pkg03;

/*
 * 동물 객체의 울음 소리를 구현해주는 클래스 
 */

public class AnimalSound {

	// 매개 변수의 다향성 : 파라미터로 지정된 타입의 자식들은 누구라도 받을 수 있음.
	public void makeAnimalSound(Animal animal) { // 동물의 소리를 구분하는 객체 동물의 객체만 전달하면 됨(타입만 동일하다면 받을 수 있는것처럼 동일)// 자동타입변환

		// 파라미터로 전달된 객체의 오버라이딩된 메소드 자동 호출
		animal.makeSound();
		 System.out.println("오버라이딩 메소드 호출");
	   }
	   
	   public void makeAnimalSound(Dog dog) {
	      dog.makeSound();
	   }
	   
	   public void makeAnimalSound(Cat cat) {
	      cat.makeSound();
	   }
	   
	   public void makeAnimalSound(Tiger tiger) {
	      tiger.makeSound();
	   }
	
	

}
