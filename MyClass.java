package ipa;

import java.util.*;
public class MyClass {
public static void main(String arg[]){
Scanner in = new Scanner(System.in);
Player pl[]=new Player[4];
for(int i=0;i<pl.length;i++){
int a=in.nextInt();in.nextLine();
String b=in.nextLine();
int c=in.nextInt();in.nextLine();
String d=in.nextLine();
String e=in.nextLine();
pl[i]=new Player(a,b,c,d,e);
}
String l1=in.nextLine();
String l2=in.nextLine();
int kk=findPlayerWithLowestRuns(pl,l1);
if(kk==0){
System.out.println("No such player");
}
else{
System.out.println(kk);
}
Player l[]=findPlayerByMatchType(pl,l2);
if(l==null){
System.out.println("No Player With given matchType");
}
else{
for(int i=0;i<l.length;i++){
System.out.println(l[i].getpi());
}
}
}
public static int findPlayerWithLowestRuns(Player p[],String al){
int a[]=new int[0];
for(int i=0;i<p.length;i++){
if(p[i].getpt().equalsIgnoreCase(al)){
a=Arrays.copyOf(a,a.length+1);
a[a.length-1]=p[i].getruns();
}
}
Arrays.sort(a);
if(a.length>0){
return a[0];
}
return 0;
}
public static Player[] findPlayerByMatchType(Player p[],String a){
Player b[] = new Player[0];
for(int i=0;i<p.length;i++){
if(p[i].getmt().equalsIgnoreCase(a)){
b=Arrays.copyOf(b,b.length+1);
b[b.length-1]=p[i];
}
}
for(int i=0;i<b.length;i++){
for(int j=i+1;j<b.length;j++){
if(b[i].getpi()<b[j].getpi()){
Player temp=b[i];
b[i]=b[j];
b[j]=temp;
}
}
}
if(b.length>0){
  return b;
}
return null;
}
}
class Player {
private int playerId;
private String playerName;
private int runs;
private String playerType;
private String matchType;
public Player(int playerId,String playerName,int runs,String playerType,String matchType){
this.playerId=playerId;
this.playerName=playerName;
this.runs=runs;
this.playerType=playerType;
this.matchType=matchType;
}
public void setpi(int playerId){
this.playerId=playerId;
}
public int getpi(){
return playerId;
}
public void setpn(String playerName){
this.playerName=playerName;
}
public String getpn(){
return playerName;
}
public void setruns(int runs){
this.runs=runs;
}
public int getruns(){
return runs;
}
public void setpt(String playerType){
this.playerType=playerType;
}
public String getpt(){
return playerType;
}
public void setmt(String matchType){
this.matchType=matchType;
}
public String getmt(){
return matchType;
}
}
