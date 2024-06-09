package ipa;
import java.util.*;
public class Ipa44 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine().toLowerCase();
	String vk="";
	for(int i=0;i<a.length();i++) {
		if(a.charAt(i)!='a' && a.charAt(i)!='e' && a.charAt(i)!='i' && a.charAt(i)!='o' && a.charAt(i)!='u') {
			vk=vk+a.charAt(i);
		}
	}
	System.out.println(vk);
}
}
