package ipa;
import java.util.*;
public class Ipa24 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String n=in.nextLine();
	String a[]=n.split(" ");
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(Character.isUpperCase(a[i].charAt(0))) {
			count++;
		}
	}
	System.out.println(count);
}
}
