package quiz;

class Quiz6 {
	public void solution(int number) {
		int result = 0;
		while(true) {

			if(number < 0) {
				break;
			} 
			result = (number % 10) + result;
			number = number / 10;
			
			if(number == 0) {
				break;
			}
		}
		System.out.println(result);
	}
}

public class Quiz5 extends Quiz6{

	public static void main(String[] args) {
		
//		문제 설명
//
//		정수 number가 주어질 때, 주어진 number의 자리 수의 합을 return한다. 단, 입력 값이 0이하의 정수이면 0을 반환한다.
//		메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 매개변수의 타입은 정수로 받으면서 접근 제어는 
//		모든 패키지에서 사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
//
//		제한사항
//
//		-2000000000 ≤ number ≤ 2000000000
//		
//		입출력 예
//
//		123456789 → 45
//		-123456789 → 0
		
		Quiz6 instance = new Quiz6();
		instance.solution(111116);
		
	}
	
}
