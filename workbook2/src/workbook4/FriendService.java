package workbook4;

import java.util.ArrayList;

public interface FriendService {
	
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int MENSEARCH = 5;
	public int WOMENSEARCH = 6;
	public int END = 7;

	

	public void addFriend(Friend friend);
	
	public void modFriend(Friend friend);
	
	public void remFriend(String name);
	
	public Friend findFriend(String name);
	
	public ArrayList<Friend> findGender(Gender gender);
	
	
	
}
