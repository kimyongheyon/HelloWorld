package co.edu;

public class TvExample {

	public static void main(String[] args) {

//		Televisiom tv = new Televisiom();
//		tv.company = "삼성";
//		tv.color="검정색";
//		tv.price = 300000;
//		tv.model= "30inch";
//		tv.turnOn();
//		tv.changeChanel(10);
//		tv.turnOff();
//		
//		
//		
//		Televisiom tv2 = new Televisiom();
//		tv2.company = "엘지";
//		tv2.color="검정색";
//		tv2.price = 300000;
//		tv2.model= "30inch";
//		tv2.turnOn();
//		tv2.changeChanel(1);
//		tv2.turnOff();
//		
//		System.out.println(tv);
//		System.out.println(tv2);

		Student stud1 = new Student(); //생성자.

		stud1.name = "홍길동";
		stud1.studNum = "1671036821";
		stud1.age = 26;
		stud1.height = 177.5;

		Student stud2 = new Student();

		stud2.name = "김용현";
		stud2.studNum = "1671036821";
		stud2.age = 26;
		stud2.height = 177.8;
		
		Student stud3 = new Student("황하경","22-876456",20,177.8);

		
//		stud1.study();
//		stud2.study();
//		
//		stud1.eat();
//		stud2.eat();
		
		stud3.showInfo();
		
		
		
	}
}
