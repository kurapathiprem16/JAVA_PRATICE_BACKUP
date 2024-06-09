package ipa;
import java.util.*;
public class Ipa42 {
public static void main(String arg[]) {
	Scanner in=new Scanner(System.in);
	String a=in.nextLine();
	char b=in.next().charAt(0);
	String k="";
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!=b) {
			k=k+a.charAt(i);
		}
	}
	System.out.println(k);
	
}
}
