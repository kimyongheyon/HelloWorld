package workbook4;

public class Friend {

	//필드

	 private String name;
	 
	 private String phone;
	 
	 
	 
	 
	 
	 public Friend(String name) {
		 this.name = name;
	 }
	 

	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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


	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	 
	 
	 
	
	
	
	
}
