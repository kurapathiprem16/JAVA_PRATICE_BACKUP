package ipa;
import java.util.*;
public class Ipa59 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	
}
}
class Flowers {
	private int flowerId;
	private String flowerName;
	private int price;
	private int rating;
	private String type;
	public Flowers(int flowerId,String flowerName,int price,int rating,String type) {
		this.flowerId=flowerId;
		this.flowerName=flowerName;
		this.price=price;
		this.rating=rating;
		this.type=type;
	}
	public int getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(int flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}