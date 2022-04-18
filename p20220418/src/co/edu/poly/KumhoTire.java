package co.edu.poly;

public class KumhoTire extends Tire{
	
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "금호 Tire수명:"+(maxRotation - accumulateRotation)+ "사용하실 수 있습니다.");
			return true;
		}else {
			System.out.println("***"+ location + "금호 Tire 펑크 ****");
			return false;
		}
	}
	
	
	

}
