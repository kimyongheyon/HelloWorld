package co.edu;

public class Board {

	// 게시글번호, 제목, 내용, 작성자, 조회(조회할 때마다 증가

	private int boardNum;
	private String title;
	private String content;
	private String writer;
	private int searchCnt = 0;

	public Board(int boardNum, String title, String content, String writer) {
		this.boardNum = boardNum;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getSearchCnt() {
		return searchCnt;
	}

	public void setSearchCnt(int searchCnt) {
		this.searchCnt = searchCnt;
	}

	public void getInfo() {
		// 번호 제목 내용 작성자 조회수
		System.out.printf("번호:%1d 제목:%-9s 내용:%-14s 작성자:%-5" + "s 조회수:%2d\n", this.boardNum, this.title, this.content,
				this.writer, this.searchCnt);
	}

	// 글번호 작성자
	// 제목 조회수
	// 내용
	public void getDetailInfo() {

		String info = "===========================================\n" + //
				"게시글번호 : %d                 작성자 : %-5s\n" + //
				"제목 : %-10s                   조회수 : %3d\n" + //
				"내용 : %-25s\n" + //
				"============================================\n";

		System.out.printf(info, //
				this.boardNum, this.writer, title, this.searchCnt, this.content);
	}
	// -를 붙이면 왼쪽부터 정렬

}
