package ipa;
import java.util.*;
public class Ipa13 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String n=in.nextLine();
	String a="";
	for(int i=0;i<n.length();i++) {
	     if(i%2!=0) {
	    	 a=a+n.charAt(i);
	     }
	}
	System.out.println(a);
}
}
