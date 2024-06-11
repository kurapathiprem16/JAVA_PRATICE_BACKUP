package ipa;
import java.util.*;
public class Ipa58 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();in.nextLine();
	Travel tra[]=new Travel[n];
	for(int i=0;i<tra.length;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		int d=in.nextInt();in.nextLine();
		boolean e=in.nextBoolean();
		tra[i]=new Travel(a,b,c,d,e);
	}
	int pp=in.nextInt();in.nextLine();
	String zzb=in.nextLine();
	int al=findAgencyWithHighestPackagePrice(tra);
	System.out.println(al);
	Travel bpo[]=agencyDetailsForGivenldAndType(tra,pp,zzb);
	if(bpo==null) {
		System.out.println("no");
	}
	else {
		for(int i=0;i<bpo.length;i++) {
			System.out.println(bpo[i].getAgencyname()+":"+bpo[i].getPrice());
		}
		
	}
}
public static int findAgencyWithHighestPackagePrice(Travel asc[]) {
	Arrays.sort(asc,(A,B)->A.getPrice()-B.getPrice());
	if(asc.length>0) {
		return asc[asc.length-1].getPrice();
	}
	return 0;
}
public static Travel[] agencyDetailsForGivenldAndType(Travel avbb[],int regno,String packageType) {
	Travel lol[]=new Travel[0];
	for(int i=0;i<avbb.length;i++) {
		if(avbb[i].isFlight()) {
			if(avbb[i].getRegno()==regno) {
				if(avbb[i].getPakagetype().equalsIgnoreCase(packageType)) {
					lol=Arrays.copyOf(lol, lol.length+1);
					lol[lol.length-1]=avbb[i];
				}
			}
		}
	}
	if(lol.length>0) {
		return lol;
	}
	return null;
}
}
class Travel {
	private int regno;
	private String agencyname;
	private String pakagetype;
	private int price;
	private boolean flight;
	public Travel(int regno,String agencyname,String pakagetype,int price,boolean flight) {
		this.regno=regno;
		this.agencyname=agencyname;
		this.pakagetype=pakagetype;
		this.price=price;
		this.flight=flight;
		
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getAgencyname() {
		return agencyname;
	}
	public void setAgencyname(String agencyname) {
		this.agencyname = agencyname;
	}
	public String getPakagetype() {
		return pakagetype;
	}
	public void setPakagetype(String pakagetype) {
		this.pakagetype = pakagetype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFlight() {
		return flight;
	}
	public void setFlight(boolean flight) {
		this.flight = flight;
	}
	
}