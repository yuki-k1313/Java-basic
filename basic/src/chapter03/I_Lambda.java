package chapter03;

// 함수형 인터페이스 : 추상메서드가 하나만 존재하는 인터페이스
interface TriangleArea {
	double triangleArea(double bottom, double height);
}

public class I_Lambda {
	
	// 람다식 : Java에서 함수형 프로그래밍을 지원하기위한 함수 표현식
	// 메서드를 선언해서 사용하는 것이 아닌 익명의 일회성 함수를 사용하는 방법
	
	// 일반적인 메서드 선언의 단점
	// 1. 한번 사용할 목적의 함수라고 하더라도 반드시 선언해서 사용해야하는 불편함이 있음
	// 2. 변수에 할당하여 사용할 수 없음 
	double triangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static void main(String[] args) {
		
		// 람다식 사용 방법
		// (매개변수, ...) -> { 구현부 }
		// 람다식에서는  반환타입을 지정하지 않음
		// 람다식을 사용할 땐 반환타입을 컴파일러가 추론함
//		(double bottom, double height) -> {  
//			return bottom * height / 2;
//		}
		
		// 람다식에서는 매개변수의 타입도 생략 가능 
//		(bottom, height) -> {
//			return bottom * height / 2;
//		}
	
		// 만약에 람다식의 구형부가 표현식(단순 반환 코드 한줄)만 존재할 땐 중괄호 생략 가능
//		(bottom, height) -> bottom * height / 2;
		
		// 람다식은 변수에 할당할 수 있음
		// 리터럴처럼 활용 가능
		// 해당 변수의 데이터 타입은 함수형 인터페이스이어야 함
		TriangleArea lambda = (bottom, height) -> bottom * height / 2;
		lambda.triangleArea(1, 2);
		
		// 매개변수로 람다식 전달 
		// 특정 메서드의 기능(동작)을 호출부에서 결정할 수 있음
		method((a, b) -> a + b);
		method(lambda);
		
	}
	
	static void method(TriangleArea lambda) { 
		double result = lambda.triangleArea(10, 5);
		System.out.println(result); 
	}
	
}







