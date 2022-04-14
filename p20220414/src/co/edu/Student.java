package co.edu;

public class Student {
	// 필드
	String name;
	String studNum;
	int age;
	double height;
	
	
//================================================	
	// 생성자) -> 인스턴스를 만들어줄 때 처리할 기능의 정의.
	// 매개값이 없는 생성자를 기본생성자. 클래스 이름이랑 같다.
      public Student() { //이게 기본생성자
    	  System.out.println("student() 생성자가 호출되었습니다.");
      }

	// 생성자는 필드의 값을 지정할 때 사용

	public Student(String name, String studNum, int age, double height) {
		this.name = name;
		this.studNum = studNum;
		this.age = age;
		this.height = height;

	}
//==================================================
	// 메소드
	void study() {
		System.out.println(name + " 공부를 합니다.");
	}

	void eat() {
		System.out.println(name + " 식사를 합니다.");
	}

	void showInfo() {
		System.out.printf("이름은:%s이고 학번은:%s이고 나이는:%d입니다 키는:%.1f입니다.", name, studNum, age, height);
	}
}
