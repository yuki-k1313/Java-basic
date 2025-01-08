package chapter02;

import java.util.concurrent.atomic.AtomicBoolean;

// 클래스 : 공통된 속성과 기능을 정의한 것
// [접근제어자] class 클래스명 { 속성, 기능 }

class ExampleClass1 {
	
	// 속성 : 객체가 가지는 정보나 상태의 정의
	// 일반적으로 변수 형태로 표현
	int atrribute1;
	double attribute2;
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수
	int instanceVariable;
	
	// 클래스 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수
	// 필드 앞에 데이터 타입 앞에 static 키워드를 사용하여 지정
	// 인스턴스 없어도 사용 가능
	static int classVariable;
	
	// 기능 : 객체가 가질 수 있는 행동이나 작업 (메서드)
	// [접근제어자] 반환타입 메서드명 (매개변수타입 매개변수명, ...) = 메서드의 선언부
	// { 메서드의 기능 구현 } = 메서드의 구현부
	void method1 () {
		System.out.println("메서드");
		// return : 메서드의 결과를 반환하는 역할 수행함
		// 일반적인 메서드는 반드시 제일 마지막에 return이 필수
		// void 메서드에서는 필수가 아님
		// 메서드 중간에서 조건문 등을 활용하여 강제 메서드 종료에도 사용됨
		return;
	}
	
	// 인스턴스 메서드 : 인스턴스 생성 후 인스턴스를 통해 호출 가능한 메서드
	// 인스턴스, 클래스 변수 및 메서드를 모두 사용가능
	int instanceMethod1(int arg1) {
		//return arg1 * atrribute1;
		return arg1 * classVariable;
	}
	
	// 클래스 메서드 : 인스턴스 생성없이 클래스로 호출 가능한 메서드
	// 반환타입 앞에 static 키워드를 붙여서 선언 가능 
	// 클래스 메서드에서는 인스턴스 변수 사용 및 인스턴스 메서드 호출이 불가능
	// 인스턴스 변수 및 인스턴스 메서드를 사용하지 않는 기능에 주로 사용됨
	static int classMethod1(int arg1) {
		// return arg1 * atrribute1;
		return arg1 * classVariable;
	}
	
}

// 스마트폰 
// - 운영체제
// - 전회번호
// - 전원상태
// - 정원 상태 변경 작업
// - 정보를 보여주는 작업
// - 전화를 거느 작업
class SmartPhone1 {
	String os;
	String telNumber;
	boolean power;
	
	void onOff() {
		power = !power;
	}
	
	void printInfo() {
		if (!power) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		System.out.println("OS : " + os);
		System.out.println("Tel Number : " + telNumber);
	}
	
	void tel(String to){
		if (!power) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		System.out.println(telNumber + "가 " + to + "에게 전화를 겁니다.");
	}
	
}

// 삼각형 관련 수학
// 빗변 구하기
// 둘레 구하기
// 넓이 구하기
class TriangleMath {
	
	// SPEED_OF_LIGHT는 TriangleMath 클래스의 단일 책임 원칙에 위배됨
	static final int SPEED_OF_LIGHT = 300_000_000;
	
	static double getHypotenuse(double bottom, double height) {
		if (bottom <= 0 || height <= 0) {
			return 0;
		}
		double hypotenuse2 = Math.pow(bottom, 2) + Math.pow(height, 2);
		double hypotenuse = Math.sqrt(hypotenuse2);
		return hypotenuse;
	}

	static double getCircumference(double bottom, double height, double hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) {
			return 0;
		}
		return 0;
	}
	
	static double getArea(double bottom, double height) {
		if(bottom <= 0 || height <= 0) {
			return 0;
		}
		double area = (bottom * height) / 2;
		return area;
	}
}

public class A_Class_Object {
	
	// 함수 : 특정한 기능에 대한 정의
	// 반환타입 함수명(매개변수타입 매개변수명, ...) { 함수의기능 }
	static int fx1(int x) {
		int y = x * x + 2 * x + 1;
		// return : 함수를 종료하면서 함수 결과를 반환하는 역할 
		// 함수에서 반드시 return 작업이 수행되어야 함
		// 단, void 반환타입 일때는 return 이 필수는 아님 
		// void : 타입 없음
		return y;
	}
	
	// 함수의 목적
	// 1. 기능을 미리 정의해두고 사용할 땐 호출하여 사용할 수 있도록 함
	// 	  (코드 중복 제거, 유지 보수성 향상, 실제 구현 내용을 알 필요 없음)
	// 2. 기능에 이름을 부여하여 사용할 수 있도록 함
	static void printBMI() {
		double x = (183 * 183);
		double y = 84 / x;
		System.out.println("bmi : " + y);
	}
	
	public static void main(String[] args) {
	
		// 인스턴스 : 특정 클래스로 정의된 것을 실체화한 것
		// 클래스명 참조변수명 = new 클래스명();
		ExampleClass1 instance1 = new ExampleClass1();
		ExampleClass1 instance2 = new ExampleClass1();
		
//		System.out.println(instance1);
//		System.out.println(instance2);
		
		// 인스턴스가 가지고 있는 속성 접근 방법
		// 인스턴스.속성명;
		instance1.atrribute1 = 10;
		instance2.atrribute1 = 20;
		new ExampleClass1().atrribute1 = 30;
		
		instance1.classVariable = 10;
		ExampleClass1.classVariable = 20;
		instance2.classVariable = 99;
		
		System.out.println(instance1.classVariable);
		System.out.println(instance2.classVariable);
		System.out.println(ExampleClass1.classVariable);
		
		// 클래스 변수를 사용할 때 주의할 점
		// 클래스 변수는 모든 인스턴스에 영향을 미치기 때문에
		// 클래스로 접근하길 권장함
		// 일반적으로 클래스 변수는 final 키워드와 함께 사용함
		
		SmartPhone1 iPhone16 = new SmartPhone1();
		SmartPhone1 galaxyS24 = new SmartPhone1();
		
		iPhone16.os = "iOS";
		iPhone16.telNumber = "010-1111-1111";
		galaxyS24.os = "Android";
		galaxyS24.telNumber = "010-9999-9999";
		
		System.out.println(iPhone16.os);
		System.out.println(galaxyS24.os);
		
		System.out.println(iPhone16.telNumber + "가 ");
		System.out.println("010-2222-2222로 전화를 겁니다");
		
		System.out.println(galaxyS24.telNumber + "가 ");
		System.out.println("010-3333-2222로 전화를 겁니다");
		
		// 인스턴스가 가지고 있는 메서드 호출 방법
		// 인스턴스.메서드명(매개변수,...);
		iPhone16.printInfo();
		iPhone16.onOff();
		iPhone16.printInfo();
		iPhone16.tel("010-2222-2222");
		
		System.out.println(fx1(10));
		System.out.println(fx1(4));
		
//		double x = (183 * 183);
//		double y = 84 / x;
//		System.out.println("bmi : " + y);
		
		printBMI();
		
		double result = TriangleMath.getHypotenuse(3, 4);
		System.out.println(result);
		
	}
	
}










