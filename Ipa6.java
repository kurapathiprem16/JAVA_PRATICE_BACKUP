package ipa;
import java.util.*;
public class Ipa6 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	college co[]=new college[n];
	for(int i=0;i<n;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		int c=in.nextInt();in.nextLine();
		String d=in.nextLine();
		int e=in.nextInt();in.nextLine();
		co[i]=new college(a,b,c,d,e);
	}
    String ads=in.nextLine();	
	college k=findCollegeWithMaximumPincode(co);
	if(k==null) {
		System.out.println("No college found with mentioned attribute");
	}
	else{
		System.out.println("ID : "+k.getId());
        System.out.println("Name : "+k.getName());
        System.out.println("Contact No : "+k.getContactno());
        System.out.println("Address : "+k.getAddress());
        System.out.println("Pin : "+k.getPincode());
	}
	college aa=searchCollegeByAddress(co,ads);
	if(aa==null) {
		System.out.println("No college found with mentioned attribute");
	}
	else {
		 System.out.println("ID : "+aa.getId());
         System.out.println("Name : "+aa.getName());
         System.out.println("Contact No : "+aa.getContactno());
         System.out.println("Address : "+aa.getAddress());
         System.out.println("Pin : "+aa.getPincode());
	}
}
 public static college findCollegeWithMaximumPincode(college c[]) {
	if(c.length>0) { 
	 college max=c[0];
	 for(int i=0;i<c.length;i++) {
		 if(c[i].getPincode()>max.getPincode()) {
			 max=c[i];
		 }
	 }
	 return max;
	}
	return null;
	 
 }
 public static college searchCollegeByAddress(college c[],String adds) {
	 for(int i=0;i<c.length;i++) {
		 if(c[i].getAddress().equalsIgnoreCase(adds)) {
			 return c[i];
		 }
	 }
	 return null;
 }
}
class college{
	private int id;
	private String name;
	private int contactno;
	private String address;
	private int pincode;
	public college(int id,String name,int contactno,String address,int pincode) {
		this.id=id;
		this.name=name;
		this.contactno=contactno;
		this.address=address;
		this.pincode=pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
