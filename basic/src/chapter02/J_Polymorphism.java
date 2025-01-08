package chapter02;

// 다형성 : 하나의 표현으로 여러가지 형태를 나타낼 수 있는 것

// 오버로딩(Overloading) : 같은 클래스 내에서 동일한 이름의 메서드를 여러 개 정의할 수 있는 것
// 오버라이딩(Overriding) : 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것 

// 업캐스팅 : 하위 클래스의 객체를 상위 클래스 혹은 구현한 인터페이스의 타입의 참조변수로 저장하는 것
// 다운캐스팅 : '업캐스팅된' 객체를 다시 원래 타입의 변수에 담는 것

class People {
	String name;
	int age;
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Teacher extends People {
	String subject;

	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
}

class Student extends People {
	int grade;
	
	Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
}

public class J_Polymorphism {
	
	public static void main(String[] args) {
		
		People people1 = new People("이성계", 20);
		Teacher teacher1 = new Teacher("이방과", 30, "역사");
		Student student1 = new Student("이방원", 15, 3);				
		
		// 업캐스팅
		People people2 = teacher1;
		System.out.println(people2.name);
		System.out.println(people2.age);
//		System.out.println(people2.subject);
		
		// 다운캐스팅
		Teacher teacher2 = (Teacher)people2;
		System.out.println(teacher2.name);
		System.out.println(teacher2.age);
		System.out.println(teacher2.subject);
		
		// 업캐스팅이 되지 않은 참조변수에 대해서는 다운캐스팅 작업시 예외 발생함
		// Student student2 = (Student)people1;
		
		// Object를 활용한 업캐스팅 다운캐스팅
		Object object1 = student1;
		Student student2 = (Student)object1;
		
	}
	
}
