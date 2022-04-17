package co.edu.app;

import java.util.Scanner;

import co.edu.Board;

public class AccountApp {
	Account newAcc;
	Account[] accounts = new Account[100];// 계좌정보를 저장하기 위한 배열.
	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {

			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>>>>");

			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				createAccount();

			} else if (menu == 2) {
				accountList();

			} else if (menu == 3) {
				deposit();

			} else if (menu == 4) {
				withdraw();

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;

			}

		}
		System.out.println("end of prog.");

	}

	// 계좌생성 시 실행 메소드
	public void createAccount() {
		System.out.println("이름을 입력하세요");
		String owner = scn.nextLine();
		System.out.println("사용하고 싶은 계좌번호를 입력하세요");
		String aN = scn.nextLine();
		System.out.println("잔액을 입력하시오");
		int balances = Integer.parseInt(scn.nextLine());
		newAcc = new Account(owner, aN, balances);
		int chk = overlap(newAcc);
		if (chk == 0) {
			System.out.println("정상입력되었습니다.");
		} else if (chk == -1) {
			System.out.println("저장공간이 없습니다.");
		} else if (chk == 1) {
			System.out.println("이미 있는 번호입니다.");
		}
	}

	// 전체 목록 실행 메소드.
	public void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) { // 반복을 돌리면서 배열을 다 돌리고 if문을 사용해서 null이 아닌 곳에 정보를 다 보여주는 기능
				accounts[i].showInfo(); // 만약에 null이면 보여지지 않는다.
				System.out.println("--------------------------------");
			}

		}
	}

	// 입금처리 실행 메소드
	public void deposit() {
		int result = 0;
		System.out.println("입금하실 계좌번호를 입력하시오");
		String aN = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNum().equals(aN)) {// 배열을 돌면서 null이 아니면 배열에 getAccountNum 와
																				// 내가 입력한 aN을 비겨한다
				System.out.println("예금액을 입력하세요");
				int deposit1 = Integer.parseInt(scn.nextLine());
				result = accounts[i].getBalance() + deposit1; // 여기서는 배열을 돌리고 비교를 다 하고 내가 입력한 배열에 번호에 돈을 넣어주는 작업이다.
																// 여기서 보듯이 저런식으로 빼주면 된다 set를 써서 위에서 더한 값을 저기에 넣어주면서 금액을
																// 바꿔줘야한다.
				accounts[i].setBalance(result);

			}
		}

	}

	// 출금처리 실행 메소드
	public void withdraw() {
		int result = 0;
		System.out.println("출금하실 계좌번호를 입력하시오");
		String aN = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNum().equals(aN)) {
				System.out.println("출금액을 입력하시오"); // 위에 입금과 똑같은 개념으로 이해하면 된다.
				int withDraw = Integer.parseInt(scn.nextLine());
				result = accounts[i].getBalance() - withDraw;
				accounts[i].setBalance(result);
			}
		}

	}

	public int overlap(Account newAcc) {
		int errorCase = -1;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNum().equals(newAcc.getAccountNum())) {
				errorCase = 1;// 배열에 계좌번호와 내가 친 계좌번호가 같으면 에러라는 코드.
				
				break;
			}
			if (accounts[i] == null) {
				accounts[i] = newAcc;
				errorCase = 0; // 그럼 정상처리
				
				break;
			}
		}
		return errorCase;
	}

}
