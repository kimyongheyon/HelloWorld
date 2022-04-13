package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();//공간을 하나 만든 것
		
		System.out.println("학생이름 점수 나이");//홍길동 80 20 next는 스페이스바 기준으로 하나씩 불러오는 기능
		s1.studName =scn.next();
		s1.score = Integer.parseInt(scn.next()); // 1이거랑 "1"랑은 다르다.
		s1.age = Integer.parseInt(scn.next());
		
		
		s2.studName =scn.next();
		s2.score = Integer.parseInt(scn.next()); // 1이거랑 "1"랑은 다르다.
		s2.age = Integer.parseInt(scn.next());
		
		Student[] students = {new Student(), new Student(), new Student()}; 
		students[0].studName = scn.next();
		students[0].score = Integer.parseInt(scn.next());
		students[0].age = Integer.parseInt(scn.next());
		
		// 조회하고 싶은 이름을 입력.
		//해당이름 갖고와서 홍길동은 나이, 점수를 표시한다. 212p
		
		
	}

}
