package ipa;
import java.util.*;
public class Ipa33 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int r=in.nextInt();
	int c=in.nextInt();
	int a[][]=new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			a[i][j]=in.nextInt();
		}
	}
	int dig1[]=new int[c];
	int dig2[]=new int[r];
	int dig[]=new int[0];
	for(int i=0;i<a[0].length;i++) {
		for(int j=0;j<a[1].length;j++) {
			 if(i==j) {
				 dig1[i]=a[i][j];
			 }
		}
	}
	int l=c-1;
	for(int i=0;i<a[0].length;i++) {
		
			dig2[i]=a[i][l];
			l--;
		
	}
    
	for(int i=0;i<dig1.length;i++) {
		dig=Arrays.copyOf(dig,dig.length+1);
		dig[dig.length-1]=dig1[i];
	}
	for(int i=0;i<dig1.length;i++) {
		dig=Arrays.copyOf(dig,dig.length+1);
		dig[dig.length-1]=dig2[i];
	}
	Arrays.sort(dig);
	int pri[]=new int[0];
	for(int i=0;i<dig.length;i++) {
		 boolean lol=true;
		 for(int j=2;j<=dig[i]/2;j++) {
			 if(dig[i]%j==0) {
				 lol=false;
				 break;
			 }
		 }
		 if(lol) {
			 pri=Arrays.copyOf(pri, pri.length+1);
			 pri[pri.length-1]=dig[i];
		 }
	}
	Arrays.sort(pri);
	System.out.println(pri[pri.length-1]);
}
}
