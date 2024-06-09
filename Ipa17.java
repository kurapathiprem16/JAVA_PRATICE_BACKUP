package ipa;
import java.util.*;
public class Ipa17 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String lol=in.nextLine();
	int v=0;
	int c=0;
	int n=0;
	for(int i=0;i<lol.length();i++) {
		if(Character.isDigit(lol.charAt(i))) {
			n++;
		}
		else if(lol.charAt(i)=='a' || lol.charAt(i)=='e' || lol.charAt(i)=='i' || lol.charAt(i)=='o' || lol.charAt(i)=='u') {
			v++;
		}
		else {
			c++;
		}
	}
	System.out.println(n+" "+v+" "+c);
}
}
