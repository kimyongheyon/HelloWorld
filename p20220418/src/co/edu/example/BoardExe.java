package co.edu.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardExe {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		BoardService service = new BoardApp();
		
		while(true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.글등록 | 2.글수정 | 3.글삭제 | 4.글상세조회 | 5.전체목록 | 6.종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("선택>>");
			int menu = Integer.parseInt(scn.next());
			
			if(menu == BoardService.ADD) {
				
				System.out.println("글번호 입력>>");
				int num = scn.nextInt();
				scn.nextLine();
				
				System.out.println("제목 입력>>");
			    String title = scn.nextLine();
			    
			    System.out.println("내용 입력>>");
			    String detail = scn.nextLine();
			    
			    System.out.println("작성자 입력>>");
			    String writer = scn.nextLine();
			    
			    LocalDateTime time = LocalDateTime.now();
			    
			    Board bo = new Board(num, title, detail, writer, time);
			    service.addWrite(bo);
			    System.out.println("★★작성완료★★");
			    
			}
			else if( menu == BoardService.MOD) {
				System.out.println("수정할 번호를 입력");
				int num = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 제목>>");
				String title = scn.nextLine();
				System.out.println("수정할 내용>>");
				String detail = scn.nextLine();
				Board bo = new Board(num,title,detail);
				service.modifyWrite(bo);
				System.out.println("★★수정완료★★");
				
			}
			else if(menu == BoardService.DEL) {
				System.out.println("삭제할 번호>>");
				int num = scn.nextInt();
				scn.nextLine();
				service.reWrite(num);
				System.out.println("★★삭제완료★★");
			}
			else if(menu == BoardService.FIND) {
				System.out.println("상세조회할 번호>>");
				int num = scn.nextInt();
				scn.nextLine();
				Board bo = service.findWrite(num);
				
				if(bo != null) {
					System.out.println(bo.toString());
				}
				else {
					System.out.println("★★조회할 수 없습니다★★");
				}
					
				}
				
			
			else if(menu == BoardService.LIST) {
				 Board bo = new Board();
				service.listWrite(bo);
			}
			else if(menu == BoardService.END) {
				System.out.println("★★프로그램을 종료합니다★★");
				break;
			}
		}


		
		
		
		
	}

}
