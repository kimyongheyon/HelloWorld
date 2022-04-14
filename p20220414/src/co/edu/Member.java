package co.edu;

public class Member {

	//필드 -> 회원아이디, 회원이름, 회원연락처, 회원나이
	private String memberId;
	private String memberName;
	private String meberPhon;
	private int meberAge;
	
	
//=================================================	
	//생성자
	
public Member(String memberId, String memberName, String meberPhon, int meberAge) {
	super();
	this.memberId = memberId;
	this.memberName = memberName;
	this.meberPhon = meberPhon;
	this.meberAge = meberAge;

} 
	
//=================================================	
	
	//메소드

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}

public String getMeberPhon() {
	return meberPhon;
}

public void setMeberPhon(String meberPhon) {
	this.meberPhon = meberPhon;
}

void setMemberId(String memberId) {
	this.memberId = memberId;
}

String getMemberId() {
	return memberId;
}


void setMeberAge(int age) {
	this.meberAge = age;
	if(age < 0) {
		meberAge = 10;
	}else {
		meberAge = age;
	}
}
 int getMeberAge(){
	 
	 return meberAge;
	 
}
 


  void showInfo() {
	  
	  System.out.printf("회원아이디는 %2s \n 회원이름 %4s \n 회원연락처는 %4s \n 회원나이는 %4d \n",memberName,memberId,meberPhon,meberAge);
  }






	
}
