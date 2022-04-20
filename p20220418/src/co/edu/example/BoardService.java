package co.edu.example;

public interface BoardService {

	public int ADD = 1;

	public int MOD = 2;

	public int DEL = 3;

	public int FIND = 4;

	public int LIST = 5;

	public int END = 6;
	
	

	public void addWrite(Board board);

	public void modifyWrite(Board board);

	public void reWrite(int num);

	public Board findWrite(int num);

	public void listWrite(Board board);

}
