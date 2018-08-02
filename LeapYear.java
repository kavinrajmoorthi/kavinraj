import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	if(a%4==0 && a%100!=0){
		System.out.println("Yes");
	}
	else if(a%4==0 && a%100==0 && a%400==0){
		System.out.println("Yes");
	}
	else{
		System.out.println("No");
	}
}
}
