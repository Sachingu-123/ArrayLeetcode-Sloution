package Sachin;

public class variableType {

	int num=20;
	void putData() {
		int a=10;
		int num=30;
		System.out.println(num);
	}
	
	void getData() {
		int no=100;
		System.out.println(no);
	}
	public static void main(String[] args) {
		
		variableType var=new variableType();
		var.putData();
		var.getData();
		
	}

}
