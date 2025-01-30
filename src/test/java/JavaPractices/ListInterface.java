package JavaPractices;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(null);
	for (Integer i : list) {
		System.out.println(i);
	}
	System.out.println("###########################################");
	ArrayList<String> arraylist= new ArrayList<String>();
	arraylist.add("Asha");
	arraylist.add("Sachin");
	arraylist.add("Sanvi");
	arraylist.add("Anvi");
	arraylist.add("Asha");
	arraylist.add("Kapil");
	arraylist.add("Rani");
	arraylist.add(null);
for (String s : arraylist) {
	System.out.println(s);
}
	}

}
