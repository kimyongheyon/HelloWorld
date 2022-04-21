package co.edu.example;

import java.util.ArrayList;

public class BoardApp  implements BoardService {
	
	

	ArrayList<Board>boards = new ArrayList<Board>();	

	@Override
	public void addWrite(Board board) {
		boards.add(board);
	}

	@Override
	public void modifyWrite(Board board) {
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i).getWriteNum() == (int)(board.getWriteNum())) {
				boards.get(i).setTitle(board.getTitle());
				boards.get(i).setDetail(board.getDetail());
				break;
			}
		}
		
	}

	@Override
	public void reWrite(int num) {
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i).getWriteNum()==(num)) {
			boards.remove(i);
		}
		}
	}

	@Override
	public Board findWrite(int num) {
		for(int i=0; i<boards.size(); i++) {
			if(boards.get(i).getWriteNum() == (num)) {
			   return boards.get(i);
				
			}
		}
		return null;
	}

	@Override
	public void listWrite(Board board) {
		for(int i=0; i<boards.size(); i++) {
			System.out.println( boards.get(i).toString());
			
		}
		
		
		
	}

	
	
	
	
	
}
