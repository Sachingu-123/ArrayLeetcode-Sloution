package Constructor;

public class Employee {
	
	 Employee() {
		 System.out.println("Default Const");
		
	}
	 Employee(int age){
		 System.out.println("Age"+age);
	 }
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee em=new Employee(22);
		
	}
}
