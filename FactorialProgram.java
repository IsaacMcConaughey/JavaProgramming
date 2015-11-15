import java.util.Scanner;

public class FactorialProgram {
	
	private static int a;
	
	public static void getVar() {
		Scanner in = new Scanner(System.in);
		System.out.print("Insert a: ");
		a = in.nextInt();
		in.close();
	}
	
	public static void make() {
		int b = a;
		for(int i = (b - 1); i > 0; i--) {
			int c = b;
			for(int x = i; x > 1; x--) {	//b = b * i;
				b = b + c;
			}
		}
		System.out.println(a + "! = " + b);
	}
	
	public static void main(String[] args) {
		getVar();
		make();
	}
}
