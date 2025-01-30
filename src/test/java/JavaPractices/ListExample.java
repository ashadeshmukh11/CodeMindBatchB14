package JavaPractices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Kolhapur");
		al.add("Sangli");
		al.add("Amravati");
		al.add("Kolhapur");
		
		// 1st - By using For Loop
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		// 2nd - By using For each loop
		
		for(String str: al) {
			System.out.println(str);
		}
		
		// 3rd - By using Iterater
		
		Iterator<String> it = al.iterator(); // hasNext(), next()
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 4th - By using List Iterater
		
		ListIterator<String> lii = al.listIterator();
		
		while(lii.hasNext()) {
			System.out.println(it.next());
		}
		
		// Hashset example
		
		/*HashSet<String> hs = new HashSet<String>();
		
		hs.add("Pune");
		hs.add("Mumbai");
		hs.add("Kolhapur");
		hs.add("Sangli");
		hs.add("Amravati");
		hs.add("Kolhapur");
		
		for(String str: hs) {
			System.out.println(str);
		}*/
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(50);
		ll.add(30);
		ll.add(90);
		ll.add(40);
		
		System.out.println("\nBefore reverse: \n");
		
		for(int i: ll) {
			System.out.println(i);
		}
		
		Collections.reverse(ll);
		
		System.out.println("\nAfter reverse: \n");
		
		for(int i: ll) {
			System.out.println(i);
		}
	}

}
