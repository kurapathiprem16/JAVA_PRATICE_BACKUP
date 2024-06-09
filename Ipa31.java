package ipa;
import java.util.*;
public class Ipa31 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String n=in.nextLine();
	String a[]=n.split(" ");
	String v="";
	for(int i=0;i<a.length;i++) {
		v=v+a[i].charAt(a[i].length()-1);
	}
	System.out.println(v);
}
}
