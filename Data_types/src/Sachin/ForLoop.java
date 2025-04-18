package Sachin;
import java.util.Scanner;

public class ForLoop {
	Scanner sc=new Scanner(System.in);
	int i;
		void forLoop() {
			for(i=0;i<=10;i++) {
				System.out.println(i);
				
			}
		}

		void whileLoop(){
			int i=0;
				while(i<=10) {
					System.out.println(i);
					i++;
				}
			
		}
		void Table() {
			int n=sc.nextInt();
			for(i=1;i<=10;i++) {
				System.out.println(n+" * "+i+" = "+(n*i));
			}
		}
		
		void factorial() {
			
		}

	public static void main(String args[]) {
		ForLoop fl=new ForLoop();
		fl.forLoop();
		fl.whileLoop();
		fl.Table();
	}
		
}
