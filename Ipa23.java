package ipa;
import java.util.*;
public class Ipa23 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine().toLowerCase();
	String b[]=a.split(" ");
	int count=0;
    String c=in.nextLine().toLowerCase();
	for(int i=0;i<b.length;i++) {
		if(b[i].contains(c)) {
			count++;
		}
	}
	System.out.println(count);
}
}
