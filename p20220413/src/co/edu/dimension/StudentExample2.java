package co.edu.dimension;

import java.util.Scanner;

public class StudentExample2 {

	public static void main(String[] args) {

//		Student s1 = new Student();
//		Student s2 = new Student();//공간을 하나 만든 것
		
//		System.out.println("학생이름 점수 나이");//홍길동 80 20 next는 스페이스바 기준으로 하나씩 불러오는 기능
//		s1.studName =scn.next();
//		s1.score = Integer.parseInt(scn.next()); // 1이거랑 "1"랑은 다르다.
//		s1.age = Integer.parseInt(scn.next());
//		
//		
//		s2.studName =scn.next();
//		s2.score = Integer.parseInt(scn.next()); // 1이거랑 "1"랑은 다르다.
//		s2.age = Integer.parseInt(scn.next());
		
		
		Scanner scn = new Scanner(System.in);
		int ff =0;
		Student[] students = {new Student(), new Student(), new Student()};
		for(int i=0; i< students.length; i++) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("이름 나이 점수를 입력하세요");
			System.out.println("-----------------------------------------------------------------");
			students[i].studName = scn.next();
			students[i].age = Integer.parseInt(scn.next());
			students[i].score = Integer.parseInt(scn.next());
			System.out.println("-----------------------------------------------------------------");
			System.out.println("이름:"+students[i].studName+" 나이:" + students[i].age+" 점수:" + students[i].score);
			System.out.println("-----------------------------------------------------------------");
			    	
			    }
		  Scanner scn2 = new Scanner(System.in);
		  System.out.println("조회하고싶은 이름을 입력해주세요.");
		String serchName = scn2.nextLine();
		 for(int i=0; i<students.length; i++) {
			 
		    	if(students[i].studName.equals(serchName) ) {
		    		System.out.println("점수는:"+students[i].score +"나이는:"+ students[i].age);
		    		ff++;
		    		}
		    		
		    	}
		 if(ff==0) {
	    	System.out.println("조회된 아이디가 없습니다.");
		 }
	    
		
	}
}
// 조회하고 싶은 이름을 입력.
//해당이름 갖고와서 홍길동은 나이, 점수를 표시한다. 212p
