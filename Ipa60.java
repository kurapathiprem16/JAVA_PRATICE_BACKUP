package ipa;
import java.util.*;
public class Ipa60 {
public static void main(String arg[]) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();in.nextLine();
	Song so[]=new Song[n];
	for(int i=0;i<so.length;i++) {
		int a=in.nextInt();in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		double d=in.nextDouble();in.nextLine();
		so[i]=new Song(a,b,c,d);
	}
	String l1=in.nextLine();
	String l2=in.nextLine();
	double aasd=findSongDurationForArtist(so,l1);
	if(aasd==0) {
		System.out.println("There are no songs with given artist");
	}
	else {
		System.out.println(aasd);
	}
	Song ff[]=getSongsInAscendingOrder(so,l2);
	if(ff==null) {
		System.out.println("There are no songs with given artist");
	}
	else {
		for(int i=0;i<ff.length;i++) {
			System.out.println(ff[i].getSongId());
			System.out.println(ff[i].getTitle()); 
		}
	}
	
}
public static double findSongDurationForArtist(Song vc[],String aa) {
	double sum=0;
	for(int i=0;i<vc.length;i++) {
		if(aa.equalsIgnoreCase(vc[i].getArtist())) {
			sum=sum+vc[i].getDuration();
		}
	}
	if(sum>0) {
		return sum;
	}
	return 0;
}
public static Song[] getSongsInAscendingOrder(Song as[],String we) {
	Song asd[]=new Song[0];
	for(int i=0;i<as.length;i++) {
		if(as[i].getArtist().equalsIgnoreCase(we)) {
			asd=Arrays.copyOf(asd,asd.length+1);
			asd[asd.length-1]=as[i];
		}
		
	}
	for(int i=0;i<asd.length;i++) {
		for(int j=i+1;j<asd.length;j++) {
			if(asd[i].getDuration()>asd[j].getDuration()) {
			   Song temp=asd[i];
			   asd[i]=asd[j];
			   asd[j]=temp;
			}
		}
	}
	if(asd.length>0) {
		return asd;
	}
	return null;
}
}
class Song {
	private int songId;
	private String title;
	private String artist;
	private double duration;
	public Song(int songId,String title,String artist,double duration) {
		this.songId=songId;
		this.title=title;
		this.artist=artist;
		this.duration=duration;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
}
