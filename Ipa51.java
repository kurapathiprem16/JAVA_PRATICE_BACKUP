package ipa;
import java.util.*;
public class Ipa51 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	LinkedHashMap<String,String> ac= new LinkedHashMap<>();
	int n=in.nextInt();
	for(int i=0;i<n;i++) {
		String a=in.nextLine();
		String b=in.nextLine();
		ac.put(a, b);
		
	}
	for(HashMap.Entry<String,String> lol:ac.entrySet()) {
		System.out.println(lol.getKey()+" "+lol.getValue());
	}
	System.out.println();
	LinkedHashMap<String,String> cc = new LinkedHashMap<>();
	for(HashMap.Entry<String,String> vc:ac.entrySet()) {
		if(!cc.containsKey(vc.getValue())) {
			cc.put(vc.getValue(),vc.getKey());
		}
		else {
			cc.put(vc.getValue(),cc.get(vc.getValue())+","+vc.getKey());
		}
	}
	for(HashMap.Entry<String,String> ans : cc.entrySet())
    {
        System.out.println(ans.getKey()+": "+ans.getValue());
    }
}
}
