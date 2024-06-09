package ipa;
import java.util.*;
public class Ipa34 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String a=in.nextLine();
	char b[]=a.toCharArray();
	Arrays.sort(b);
	System.out.println(b[a.length()-1]);
}
}
