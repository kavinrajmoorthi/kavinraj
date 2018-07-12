import java.util.Scanner;
public class vowels {
	public static void main(String args[]){
		char a=0,e=0,i=0,o=0,u=0;
		System.out.println("Enter the letter");
		Scanner scan=new Scanner(System.in);
		a=scan.next().charAt(0);
		String b=String.valueOf(a).replaceAll("[^a-zA-Z]","");
		String c=String.valueOf(a).replaceAll("[a-zA-Z]","");
		if(a>=65 && a<=90 || a>=97 && a<=122){
		if(b.equalsIgnoreCase("a") || b.equalsIgnoreCase("e") || b.equalsIgnoreCase("i") || b.equalsIgnoreCase("o") || b.equalsIgnoreCase("u")){
			System.out.println("VOWEL");
		}
		else{
			System.out.println("CONSONANT");
		}
		}
		else{
			System.out.println("Invalid....!");
		}
	}
}
