package SwitchCase;

public class PrintingPattern3 {

	public static void main(String[] args) {
		int n=5;
		int space=0;
		int star=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("\t");
				}
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
			space++;
			star--;
			System.out.println();
		}

	}

}
