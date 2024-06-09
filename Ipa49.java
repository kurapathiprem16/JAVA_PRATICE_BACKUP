package ipa;
import java.util.*;
public class Ipa49 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a="";
	String b=in.nextLine();
	for(int i=b.length()-1;i>=0;i--) {
		a=a+b.charAt(i);
	}
	System.out.println(a);
}
}
