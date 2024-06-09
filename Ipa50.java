package ipa;
import java.util.*;
public class Ipa50 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine().toLowerCase();
	String v[]=a.split(" ");
	int count=0;
	for(int i=0;i<v.length;i++) {
		if(v[i].charAt(0)==v[i].charAt(v[i].length()-1)) {
			count++;
		}
	}
	System.out.println(count);
}
}
