package ipa;
import java.util.*;
public class Ipa19 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine();
	int count=0;
	for(int i=0;i<a.length();i++) {
		if(Character.isUpperCase(a.charAt(i))) {
			count++;
		}
	}
	System.out.println(count);
}
}
