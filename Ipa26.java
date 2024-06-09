package ipa;
import java.util.*;
public class Ipa26 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String n=in.nextLine();
	String a="";
	for(int i=0;i<n.length();i++) {
		if(!a.contains(n.substring(i,i+1))) {
			a=a+n.substring(i,i+1);
		}
		
	}
	for(int i=0;i<a.length();i++) {
		int count=0;
		for(int j=0;j<n.length();j++) {
			if(a.charAt(i)==n.charAt(j)) {
				count++;
			}
		}
		if(count<=1) {
			System.out.println(a.charAt(i));
			break;
		}
	}
	
}
}
