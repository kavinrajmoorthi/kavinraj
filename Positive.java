import java.util.Scanner;
public class Positive {
	public static void main(String args[]){
		int a;
		System.out.println("Enter the integer");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		if(a<0){
			System.out.println("Negative");
		}
		else if(a==0){
			System.out.println("Zero");
		}
		else if(a>0){
			System.out.println("Positive");
		}
	}

}
