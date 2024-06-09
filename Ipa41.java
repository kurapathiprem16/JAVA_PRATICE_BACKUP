package ipa;
import java.util.*;
public class Ipa41 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	String s=in.nextLine();
	char ch='\0';
	String str=" ";
	 for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i)!=ch)
         {
             ch = s.charAt(i);
             str += ch;
         }
     }
	 System.out.println(str);
	}
	
}

