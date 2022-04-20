package workbook4;

public class Friend {

	//필드

	 private String name;
	 
	 private String phone;
	 
	 private Gender gender;  
	 
	 
	 
	 
	 
	 public Friend(String name) {
		 this.name = name;
	 }
	 

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	

	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", gender=" + gender + "]";
	}


	 
	 
	
	
	
	
}
