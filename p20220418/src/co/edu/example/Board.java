package co.edu.example;

import java.time.LocalDateTime;

public class Board {
	
	public int writeNum;
	public String title;
	public String detail;
	public String writer;
	public LocalDateTime time;
	
	
	
	public Board() {
		
	}
	
	public Board(int writeNum, String title, String detail) {
		super();
		this.writeNum = writeNum;
		this.title = title;
		this.detail = detail;
	}




	public Board(int writeNum, String title, String detail, String writer, LocalDateTime time) {
		super();
		this.writeNum = writeNum;
		this.title = title;
		this.detail = detail;
		this.writer = writer;
		this.time = time;
	}




	public int getWriteNum() {
		return writeNum;
	}




	public void setWriteNum(int writeNum) {
		this.writeNum = writeNum;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDetail() {
		return detail;
	}




	public void setDetail(String detail) {
		this.detail = detail;
	}




	public String getWriter() {
		return writer;
	}




	public void setWriter(String writer) {
		this.writer = writer;
	}



	
	public LocalDateTime getTime() {
		return time;
	}
	
	public void setTime(LocalDateTime time) {
		this.time = time;
	}





	@Override
	public String toString() {
		return "Board [writeNum=" + writeNum + ", title=" + title + ", detail=" + detail + ", writer=" + writer
				+ ", time=" + time + "]";
	}

	
	
	
	
	
	
}
