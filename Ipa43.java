package ipa;
import java.util.*;
public class Ipa43 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine();
	String dup="";
	for(int i=0;i<a.length();i++) {
		if(!dup.contains(a.substring(i,i+1))) {
			dup=dup+a.substring(i,i+1);
		}
	}
	System.out.println(dup);
	
}
}
