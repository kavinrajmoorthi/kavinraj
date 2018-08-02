import java.util.Scanner;
public class Alpha {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	String a=s.replaceAll("[^a-zA-Z]"," ");
	if(a==s){
		System.out.println("Alphabet");
	}
	else{
		System.out.println("No");
	}
}
}
