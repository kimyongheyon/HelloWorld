package workbook2;

public class Practice9 {

	public static void main(String[] args) {

		int[] oldArray = {1, 2, 3};
		
		int[] newArray = new int[5];
		
		for(int i=0; i<oldArray.length;i++) {
			
			newArray[i]=oldArray[i];
		}
		for(int i=0; i<newArray.length; i++) {
		System.out.println(newArray[i]+", ");
		}		
	}

}
