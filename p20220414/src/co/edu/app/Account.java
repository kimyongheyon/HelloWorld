package co.edu.app;

public class Account {

  //필드 : 계좌번호, 예금주, 잔액

	private String accountNum;
	private String accountHolder;
	private int balance;
	
	
	
	
	
	
	
	public Account(String accountHolder, String accountNum, int balance) {
		super();
		this.accountNum = accountNum;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}







	public String getAccountNum() {
		return accountNum;
	}







	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}







	public String getAccountHolder() {
		return accountHolder;
	}







	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}







	public int getBalance() {
		return balance;
	}







	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
   public void showInfo() {
	   System.out.printf("%s의\n계좌번호:%s\n잔액:%d이 남아있습니다.\n"//
			   ,this.accountHolder,this.accountNum,this.balance);
   }
	
	
	
	
	
	
	
}
