package co.edu.dimension;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		Student s1 = new Student();//학생이름,점수를 저장할 수 있는 공간 비어있는 공간을 만드는 것
		s1.studName = "홍길동";
	    s1.score = 80;
	    s1.age = 20;
	    Student s2 = new Student();
	    s2.studName = "김길동";
	    s2.score = 75;
	    s2.age = 15;
	    Student s3 = new Student();
	    
	    s3.studName = "박길동";
	    s3.score = 60;
	    s3.age = 30;
	    
	    Student[] students = { s1, s2, s3 };
	    
	    int searchAge = 23;
	    for(int i=0; i<students.length; i++) {
	    	if(students[i].age > searchAge) {
	    		System.out.println(students[i].age);
	    	}
	    }
	    	
	    
	    Scanner scn = new Scanner(System.in);
//	    
	    System.out.println("학생이름 입력하세요");
//
	    String serchName = scn.nextLine();
	    
	    for(int i=0; i<students.length; i++) {
	    	if(students[i].studName.equals(serchName)) {
	    		System.out.println(students[i].score);
	    	}
	    	
	    }
	    System.out.println("end of prog.");
	    
	}

}
