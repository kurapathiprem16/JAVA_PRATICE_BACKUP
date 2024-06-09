package ipa;
import java.util.*;
public class Ipa25 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String n=in.nextLine();
	String a[]=n.split(" ");
	String b="";
	for(int i=0;i<a.length;i++) {
		b=b+a[i].charAt(0);
	}
	System.out.println(b);
}
}
