package ipa;
import java.util.*;
public class Ipa45 {
public static void main(String arg[]) {
	Scanner in =new Scanner(System.in);
	String a=in.nextLine();
    String num="";
    String alp="";
    String spe="";
    String b[]=new String[0];
	for(int i=0;i<a.length();i++) {
		if(Character.isAlphabetic(a.charAt(i))) {
			alp=alp+a.charAt(i);
			if(num!="") {
				b=Arrays.copyOf(b,b.length+1);
				b[b.length-1]=num;
				num="";
			}
			else if(spe!="") {
				b=Arrays.copyOf(b,b.length+1);
				b[b.length-1]=spe;
				spe="";
			}
			
		}
		else if(Character.isDigit(a.charAt(i))) {
			num=num+a.charAt(i);
			if(alp!="") {
				b=Arrays.copyOf(b, b.length+1);
				b[b.length-1]=alp;
				alp="";
			}
			else if(spe!="") {
				b=Arrays.copyOf(b,b.length+1);
				b[b.length-1]=spe;
				spe="";
			}
		}
		else {
			spe=spe+a.charAt(i);
			if(num!="") {
				b=Arrays.copyOf(b,b.length+1);
				b[b.length-1]=num;
				num="";
			}
			else if(alp!="") {
				b=Arrays.copyOf(b,b.length+1);
				b[b.length-1]=alp;
				alp="";
			}
			
			
		}
		
	}
	if(num!="") {
		b=Arrays.copyOf(b,b.length+1);
		b[b.length-1]=num;
		num="";
	}
	else if(alp!="") {
		b=Arrays.copyOf(b,b.length+1);
		b[b.length-1]=alp;
		alp="";
	}
	else {
		b=Arrays.copyOf(b,b.length+1);
		b[b.length-1]=spe;
		spe="";
	}
	int sum=0;
	for(int i=0;i<b.length;i++) {
		if(Character.isDigit(b[i].charAt(0))) {
			sum=sum+i;
		}
	}
	for(int i=0;i<sum;i++) {
		System.out.print(a);
	}
}
}
