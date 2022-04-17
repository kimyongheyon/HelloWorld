package co.edu.statis;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new Person("232323-23223","홍길동");
		p1.name = "김길동";
//		p1.ssn = "1516161"; //final을 걸어놔서 못 바꾼다.
				
		Person p2 = new Person("1234-1313","김길동");
		
	}

}
