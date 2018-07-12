import java.util.Scanner;
public class even {
		public static void main(String args []){
			int a;
			System.out.println("Enter the number");
			Scanner scan=new Scanner(System.in);
			a=scan.nextInt();
			if(a%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
		
	    }

}
