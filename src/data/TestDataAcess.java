package data;

public class TestDataAcess {

	public static void main(String[] args) {

		
		
		
		DataAcess data = DataAcess.getInstance();
		data.getConnection();
		
		CSV csv = new CSV();
		csv.lavCSVfil(data.dataFraResultset());
		
		
	}

}