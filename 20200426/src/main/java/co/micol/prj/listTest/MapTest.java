package co.micol.prj.listTest;

import java.util.HashMap;
import java.util.Map;

import co.micol.prj.dto.StudentVO;

public class MapTest {
	
	public void mapTest() {
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", "홍길동");    //값을 넣을 때 (KEY, VALUE)
		map.put("address", "대구");
		
		
		System.out.println(map.get("name"));  //불러 올 때 (KEY)
		System.out.println(map.get("address"));
	}
	
	public void studentMap() {
		Map<Integer,StudentVO> map = new HashMap<Integer,StudentVO>();
		map.put(1,new StudentVO("홍길동"));
		map.put(2,new StudentVO("김길동"));
		
		System.out.println(map.get(1));
	}
	
	

}
