package co.edu.inherit;

public class CarExample {

	public static void main(String[] args) {

		Bus bus = new Bus();
		// 부모에게서 상속 받은 필드, 메소드가 있을 거

		bus.model = "45인승 버스";
		bus.drive();
		// 자식에서 새로운 필드 메소드가 있다.

		bus.busNo = "240";
		bus.fee();
		System.out.println(bus.toString());

		Taxi taxi = new Taxi();

		taxi.model = "SonataTaxi"; // 부모 필드 메소드.
		taxi.drive();

		taxi.type = "개인택시"; // 자식 필드 메소드.
		taxi.metering();
		System.out.println(taxi.toString());

		// 자식클래스의 인스턴스 = 부모 참조변수에 할당이 가능하다.

		Bus[] buses = new Bus[10];
		Taxi[] taxies = new Taxi[10];

		Car[] cars = new Car[10];
		cars[0] = bus; // 자동형변환으로 인해 가능하다 (promotion)
		cars[1] = taxi; // 자동형변환으로 인해 가능하다 (promotion)

	}

}
