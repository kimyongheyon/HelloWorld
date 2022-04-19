package co.edu.project;

public class OracleDAO  implements DAO{

	@Override
	public void insert() {
		System.out.println("oracle 입력처리.");	
	}

	@Override
	public void update() {
		System.out.println("oracle 수정처리.");
	}

	@Override
	public void delete() {
		System.out.println("oracle 삭제처리.");
	}

	@Override
	public void list() {
		System.out.println("oracle 리스트처리.");
	}

	
	
	
	
	
	
}
