package com.javalab.polymorphism.pkg19;

// 중첩 인터페이스를 테스트할 실행클래스[이해가 안되면 외워, 패턴이라도 기억해]
public class ButtonMain {
	public static void main(String[] args) {
		// ok 버튼 객체 생성
		Button2 btnOk = new Button2();
		
		// [중첩클래스]ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class OkListener implements Button2.ClickListener{ // 중첩이기 때문에 .으로 구분하여 입력,implements => interface 구현하려고 하는구나
			@Override
			public void onClick() {
				System.out.println("ok 버튼을 클릭했습니다.");
			}
			
		}
		// ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());
		
		// ok 버튼 클릭하기
		btnOk.click();
		
		
		
		
		// Cancel 버튼객체 생성
		Button2 btnCancel = new Button2();
		
		// Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button2.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		// Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		// Cancel 버튼 클릭하기
		btnCancel.click();
	}

}
