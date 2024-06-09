package ipa;
import java.util.*;
public class Ipa52 {
public static void main(String arg[]) {
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();in.nextLine();
	Car aa[]=new Car[n];
	for(int i=0;i<n;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		aa[i]=new Car(a,b,c);
	}
	int kl=in.nextInt();in.nextLine();
	Car oo[]=rem(aa,kl);
	if(oo==null) {
		System.out.println("There are no car with given id");
	}
	else {
		for(int i=0;i<oo.length;i++) {
			System.out.println(oo[i].getCardId()+":"+oo[i].getCarName());
		}
	}
	
}
public static Car[] rem(Car a[],int v){
	Car cx[]=new Car[0];
	for(int i=0;i<a.length;i++) {
		if(v!=a[i].getCardId()) {
			cx=Arrays.copyOf(cx,cx.length+1);
			cx[cx.length-1]=a[i];
		}
	}
	if(a.length>0) {
		return cx;
	}
	return null;
}
}
class Car {
	private int cardId;
	private String carName;
	private String fuelType;
	public Car(int cardId,String carName,String fuelType) {
		this.cardId=cardId;
		this.carName=carName;
		this.fuelType=fuelType;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
}