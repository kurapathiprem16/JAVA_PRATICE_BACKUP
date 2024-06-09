package ipa;
import java.util.*;
public class Ipa15 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String n=in.nextLine().toLowerCase();
	String lol="";
	for(int i=0;i<n.length();i++) {
		if(i%2!=0) {
			if(n.charAt(i)!='a' && n.charAt(i)!='e' && n.charAt(i)!='i' && n.charAt(i)!='o' &&  n.charAt(i)!='u' && n.charAt(i)!=' ') {
				lol=lol+n.charAt(i);
			}
		}
	}
	System.out.println(lol);
}
}
