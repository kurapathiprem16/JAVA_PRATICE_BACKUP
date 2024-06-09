package ipa;
import java.util.*;
public class Ipa4 {
	public static int getCountByType(Footware f[],String par) {
		int count=0;
		for(int i=0;i<f.length;i++) {
			if(par.equalsIgnoreCase(f[i].getFootwearType())) {
				count++;
			}
		}
		if(count>0) {
			return count;
		}
		return 0;
	}
  	public static Footware[] getSecondHighestPriceByBrand(Footware f[],String ls){
  		Footware det[]=new Footware[0];
  		for(int i=0;i<f.length;i++) {
  			if(f[i].getFootwearName().equalsIgnoreCase(ls)) {
  				det=Arrays.copyOf(det,det.length+1);
  				det[det.length-1]=f[i];
  			}
  		}
  		for(int i=0;i<det.length;i++) {
  			for(int j=i+1;j<det.length;j++) {
  			     if(det[i].getPrice()>det[j].getPrice()) {
  			    	Footware temp=det[i];
  	  				det[i]=det[j];
  	  				det[j]=temp;
  			     }
  				
  			}
  		}
  		Footware lol[]=new Footware[0];
  		for(int i=0;i<det.length;i++) {
  			if(det[i].getPrice()>det[0].getPrice()) {
  				lol=Arrays.copyOf(lol,lol.length+1);
  				lol[lol.length-1]=det[i];
  			}
  		}
  		if(det.length>0) {
  			return lol;
  		}
  		return null;
  	}
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	Footware fc[]=new Footware[n];
	for(int i=0;i<n;i++) {
		int footwearId=in.nextInt();in.nextLine();
		String footwearName=in.nextLine();
		String footwearType=in.nextLine();
		int price=in.nextInt();in.nextLine();
		fc[i]=new Footware(footwearId,footwearName,footwearType,price);
	}
	String tn=in.nextLine();
	String lk=in.nextLine();
	int vc=getCountByType(fc,tn);
	if(vc>0) {
		System.out.println(vc);
	}
	else {
		System.out.println("Footwear not available");
	}
	Footware a[]=getSecondHighestPriceByBrand(fc,lk);
	if(a!=null) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].getFootwearId()+" "+a[i].getFootwearName()+" "+a[i].getPrice());
		}
	}
	else {
		System.out.println("Brand not available");
	}
	
}
}

class Footware{
	private int footwearId;
	private String footwearName;
	private String footwearType;
	private int price;
	public Footware(int footwearId,String footwearName,String footwearType,int price) {
		this.footwearId=footwearId;
		this.footwearName=footwearName;
		this.footwearType=footwearType;
		this.price=price;
		
	}
	public int getFootwearId() {
		return footwearId;
	}
	public void setFootwearId(int footwearId) {
		this.footwearId = footwearId;
	}
	public String getFootwearName() {
		return footwearName;
	}
	public void setFootwearName(String footwearName) {
		this.footwearName = footwearName;
	}
	public String getFootwearType() {
		return footwearType;
	}
	public void setFootwearType(String footwearType) {
		this.footwearType = footwearType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}