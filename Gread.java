import java.util.Scanner;
public class Gread {

	public static void main(String[] args) {

				int a,b,c,d,sum;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter marks of subject maths:");
				a=sc.nextInt();
				System.out.print("Enter marks of subject ss:");
				b=sc.nextInt();
				System.out.print("Enter marks of subject st:");
				c=sc.nextInt();
				System.out.print("Enter marks of subject en:");
				d=sc.nextInt();
				
				sum=a+b+c+d;
				System.out.println("Total Marks="+sum);
				
				int avg= sum/4;
				System.out.println("Average marks="+avg);
				avg=avg/10;

				switch(avg){
					case 10:
						System.out.print("Grade A");
						break;
					case 9:
						System.out.print("Grade A");
						break;
					case 8:
						System.out.print("Grade B");
						break;
					case 7:
						System.out.print("Grade C");
						break;
					case 6:
						System.out.print("fail");
						break;
					default:
						System.out.print("invalid marks");
				}

			}

	}

