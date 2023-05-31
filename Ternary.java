import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:");
		a=sc.nextInt();
		System.out.print("Enter Second Number");
		b=sc.nextInt();
		c=(a>b) ? a : b;
		System.out.println(c);
	}

}
