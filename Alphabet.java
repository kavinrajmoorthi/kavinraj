import java.util.Scanner;
public class Alphabet {
	public static void main(String args[]){
		char a;
		System.out.println("Enter the Character");
		Scanner scan=new Scanner(System.in);
		a=scan.next().charAt(0);
		if(a>=65 && a<=90 ||a>=97 && a<=122){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
