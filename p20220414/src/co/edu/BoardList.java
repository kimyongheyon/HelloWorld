package co.edu;

public class BoardList {

	private Board[] boards;

	// 배열크기 초기화
	public void init(int size) {
		boards = new Board[size];
	}

	// 배열에 한 건 입력.
	public int addBoard(Board board) {
		// 더이상 저장공간이 없을때... false
//		boolean check = false;
		int errorCase = -1; //저장공간이 없음.
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNum() == board.getBoardNum()) {
				errorCase =1;//동일한 값이 있을 경우 에러.
				break;
			}
			if (boards[i] == null) {
				boards[i] = board;
                errorCase = 0; //정상처리
				break;
			}
		}
		return errorCase;
	}

	// 수정: 게시글번호로 찾아와서 내용과 제목만 바꾼다.

	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNum() == board.getBoardNum()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}

	// 게시글 목록
	public Board[] boardList() {
		return boards;

	}
	// 게시글 삭제 게시글번호

	public boolean removeBoard(int bNo) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNum() == bNo) {
				boards[i] = null; // 배열의 위치 null를 대입.
				check = true;
				break;
			}
		}
		return check;
	}

	// 게시글 한 건 조회. 게시글번호
	public Board searchBoard(int bNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNum() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);// 조회수 증가
				return boards[i]; // 배열의 위치 null를 대입.

			}
		}
		return null;
	}
	
	//작성자 조회
	public Board[] searchWriter(String writer) {
		Board[] sBoards = new Board[5];
		for(int i=0; i<boards.length; i++) { //찾을 대상의 배열을 뒤지고 찾는 것
			if(boards[i]!= null && boards[i].getWriter().equals(writer)) {
			for(int j=0; j<sBoards.length; j++) { //찾아와서 sBoard라는 곳에 다시 돌면서 저장하는 것
				if(sBoards[j]==null) {
					sBoards[j] = boards[i];
					break;
				}
			}
			}
		}
		return sBoards;
	}
	
	
	
	
	
	
	
	

}
