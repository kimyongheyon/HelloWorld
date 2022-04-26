package co.micol.prj.listTest;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj.dto.StudentVO;

public class ListTest {

	public void listTest() {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("박기자");
		list.add("이승리");

		for (String str : list) {
			System.out.println(str);
		}

	}

	public void studentList() {
		List<StudentVO> students = new ArrayList<StudentVO>();
		StudentVO student = new StudentVO();
		student.setStudentId("202204001");
		student.setName("홍길동");
		student.setAge(20);
		student.setBirthDay(Date.valueOf("2002-03-01"));
		student.setGender("남자");
		students.add(student);

		student = new StudentVO(); // 인스턴스를 새로 만든 게 아니라 초기화해서 다시 담는 것
		student.setStudentId("202204002");
		student.setName("박기자");
		student.setAge(20);
		student.setBirthDay(Date.valueOf("2002-04-01"));
		student.setGender("여자");
		students.add(student);

		for (StudentVO vo : students) {
			vo.toString();
			System.out.println(vo.getStudentId());
		}
	}
}
