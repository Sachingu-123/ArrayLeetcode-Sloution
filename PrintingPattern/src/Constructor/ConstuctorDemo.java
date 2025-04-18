package Constructor;



public class ConstuctorDemo {
	//1. Const. name must be same as class name
	//2.no explict return type isused for the const.
	//3.A java const. can't be abstract , static, final and synchronized keyword.
	 ConstuctorDemo(){ //Default Const.
		
		 System.out.println("Default const");
	}
	 
	 ConstuctorDemo(String name){
		 System.out.println("My name is :"+name);
		 
	 }
	  

	public static void main(String[] args) {
		ConstuctorDemo cd=new ConstuctorDemo();
		ConstuctorDemo dc=new ConstuctorDemo("Sachin");
		

	}

}
