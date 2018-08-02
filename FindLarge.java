import java.util.*;
public class FindLarge {
public static void main(String[] args) {
	String s="";
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b[]=new int[a];
	for(int i=0;i<a;i++){
		b[i]=scan.nextInt();
	}
	Arrays.sort(b);
	for(int d:b)
		 s=b.toString();
	System.out.print(s.length()-1+" ");
}
}
