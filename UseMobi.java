package functionInterface;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UseMobi {
	public static void main(String[] args) {
	Mobi m1=new Mobi("Redmi","Note 7 Pro",15000,"blue",4,"i3",64,8.0f);
	Mobi m2=new Mobi("Oppo","A7",10000,"black",6,"i5",32,5.3f);
	Mobi m3=new Mobi("Apple","13 pro max",150000,"gold",8,"i15",256,9.0f);
	Mobi m4=new Mobi("Realme","2 Pro",13000,"black",16,"i2",16,3.4f);
	Mobi m5=new Mobi("Samsung","s22 ultra",45000,"white",128,"i5",128,9.0f);
	Mobi m6=new Mobi("Vivo","v22",28000,"red",6,"i7",64,4.0f);
//	List<Mobi>mob=Arrays.asList(m1,m2,m3,m4,m5,m6);
//	mob.add(m1);
//	mob.add(m2);
//	mob.add(m3);
//	mob.add(m4);
//	mob.add(m5);
//	mob.add(m6);
//	Collections.sort(mob);    //Using Comparable
//	mob.forEach(x->System.out.println(x));
	List<Mobi>mob=Arrays.asList(m1,m2,m3,m4,m5,m6);  //using comparator
	Collections.sort(mob,new IdSort());              //we need to add list name and new class name then put parenthesis
	mob.forEach(x->System.out.println(x));
	
}
}
