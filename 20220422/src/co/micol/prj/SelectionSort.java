package co.micol.prj; //package 이름 만들 때  도메인 주소 반대로 쓴다 ex) com.naver.메인프로젝트명.서브프로젝트명

public class SelectionSort {

	private int i;
	private int j;    //내부에서 선언하면 초기값을 안 줘도 가능
	private int min;  

	public void sort(int[] arr ) {
	//초기데이터 출력
		arrPrint(arr);
		for(i= 0; i<arr.length-1; i++) {
			min = i;
			for(j= i+1; j<arr.length; j++) { //요소비교
				if(arr[min] >	 arr[j]) {    //내림차순을 원하면 부등호에 방향을 반대로!
					min=j;
				}
			}
			if(min != i) {      //선행조건문으로 만들면 좋다.
	           int temp= arr[i];    //이게 swap!!!!
	           arr[i] = arr[min];
	           arr[min] = temp;
	           
			}
		}
		
		resultPrint(arr);
	}

	private void resultPrint(int[] arr) {
		System.out.println("===결과 데이터 ===");
		for(int i : arr) {
			System.out.println(i+" ");
		}
		System.out.println("------------------");
	}
	

	private void arrPrint(int[] arr) {
		System.out.println("===초기 데이터 ===");
		for(int i : arr) {
			System.out.println(i+" ");
		}
		System.out.println("------------------");
	}
	
		

}
