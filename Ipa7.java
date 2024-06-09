package ipa;
import java.util.*;
public class Ipa7 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	Motel mo[]=new Motel[n];
	for(int i=0;i<n;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		int d=in.nextInt();in.nextLine();
		String e=in.nextLine();
		double f=in.nextDouble();in.nextLine();
		mo[i]=new Motel(a,b,c,d,e,f);
}

}
public static int totalNoOfRoomsBooked(Motel m[],String a) {

    int total = 0;
    for(int i = 0; i<m.length; i++)
    {
        if(m[i].getCabFacility().equalsIgnoreCase(a) && m[i].getNoofroomsbooked()>5)
        {
            total = total +  m[i].getNoofroomsbooked();
        }
    }
    if(total>0)
    {
        return total;
    }
    else{
        return 0;
    }
}
}

class Motel{
	private int motelId;
	private String motelName;
	private String dateofbooking;
	private int noofroomsbooked;
	private String cabFacility;
	private double totalBill;
	public Motel(int motelId,String motelName,String dateofbooking,int noofroomsbooked,String cabFacility,double totalBill){
		this.motelId=motelId;
		this.motelName=motelName;
		this.dateofbooking=dateofbooking;
		this.noofroomsbooked=noofroomsbooked;
		this.cabFacility=cabFacility;
		this.totalBill=totalBill;
	}
	public int getMotelId() {
		return motelId;
	}
	public void setMotelId(int motelId) {
		this.motelId = motelId;
	}
	public String getMotelName() {
		return motelName;
	}
	public void setMotelName(String motelName) {
		this.motelName = motelName;
	}
	public String getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(String dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public int getNoofroomsbooked() {
		return noofroomsbooked;
	}
	public void setNoofroomsbooked(int noofroomsbooked) {
		this.noofroomsbooked = noofroomsbooked;
	}
	public String getCabFacility() {
		return cabFacility;
	}
	public void setCabFacility(String cabFacility) {
		this.cabFacility = cabFacility;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	
}