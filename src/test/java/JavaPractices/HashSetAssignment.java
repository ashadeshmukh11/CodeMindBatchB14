package JavaPractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> pan = new HashSet<String>();
pan.add("AUD2UC");
pan.add("BUD2UD");
pan.add("CUD2UE");
pan.add("EUD2UF");
pan.add("FUD2UC");
pan.add("AUD2UC");
pan.add(null);
 for(String s : pan) {
	 System.out.println(s);
 }
 System.out.println("################################################");
 HashSet<Integer> l1 = new HashSet<Integer>();
 l1.add(10);
 l1.add(20);
 l1.add(30);
 l1.add(40);
 HashSet<Integer> l2 = new HashSet<Integer>();
 l2.addAll(l1);
 l2.add(70);
 l2.add(80);
 l2.add(60);
 for(Integer i: l2) {
	 System.out.println(i);
 }
 
//Removes the element at the specified position in this list.
 System.out.println("Removes the element at the specified position in this list.");
l2.remove(1);
for(Integer j: l2) {
	 System.out.println(j);
}
System.out.println("Removes from this list all of its elements that are contained in the specified collection.");
l2.removeAll(l1);
for(Integer k: l2) {
	 System.out.println(k);
}
System.out.println("################################");
System.out.println("l2 is empty:"+l2.isEmpty());
System.out.println("Size of l2:"+l2.size());
System.out.println("l2 contains 90:"+l2.contains(90));
System.out.println("l2 contains 40:"+l2.contains(40));
System.out.println("################################");
for(Integer k: l2) {
	 System.out.println(k);
}
System.out.println("################################");
Iterator<String> str = pan.iterator();
 	 while(str.hasNext()) {
 		 System.out.println(str.next());
 	 }
	
	}

}
