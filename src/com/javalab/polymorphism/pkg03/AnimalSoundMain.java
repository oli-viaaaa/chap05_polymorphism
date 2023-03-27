package com.javalab.polymorphism.pkg03;

/*
 *  매개변수의 다향성 예제 - 객체를 매개변수로 전달할 때 받는 쪽에서 부모 타입으로 받을 수 있음
 */

public class AnimalSoundMain {
	public static void main(String[] args) {
		// 동물 울음소리를 구현해주는 객체 생성
		AnimalSound animalSounds = new AnimalSound();
		Animal dog = new Dog(); // 자식 객체를 생성해서 부모 타입에 저장(다향성)
		Animal cat = new Cat(); // 자식 객체를 생성해서 부모 타입에 저장(다향성)
		Animal tiger = new Tiger();

		// 동물 울음소리 구현 객체의 메소드에 객체 전달
		animalSounds.makeAnimalSound(dog);
		animalSounds.makeAnimalSound(cat);
		animalSounds.makeAnimalSound(tiger);

	}

}
