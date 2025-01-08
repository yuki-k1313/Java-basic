package chapter01;

import java.util.Scanner;

public class H_Controll_While {

	public static void main(String[] args) {
		
		// while문 : 반복할 횟수가 결정되어있지 않을 때 사용하는 반복문
		// 조건이 true인 동안 반복, 조건이 false가 되면 반복을 종료
		// while (논리표현식) { 논리표현식이 true일 때 반복할 코드 블럭 }
		
		// 사용자로부터 입력받은 정수를 모두 더해 출력
		// 만약 사용자가 양수가 아닌 값을 입력하면 총합을 출력후 프로그램 종료
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = scanner.nextInt();
		int sum = 0;

		while(num > 0) {
			sum += num;
			System.out.print("정수를 입력하세요. : ");
			num = scanner.nextInt();
		}

		System.out.println("총합 : " + sum);
		
		// continue : 반복문에서 continue를 만나면 코드블럭의 끝으로 커서를 이동
		// break : 반복문에서 break를 만나면 반복문을 탈출
		// continue, break 문은 조건문과 같이 사용됨
		
		num = 0;
		sum = 0;
		while (true) {
			System.out.print("정수 : ");
			num = scanner.nextInt();
			if (num <= 0) break;
			if (num % 2 != 1) continue;
			
			sum += num;				
		}
		
		System.out.println("총합 : " + sum);
				
	}
	
}
