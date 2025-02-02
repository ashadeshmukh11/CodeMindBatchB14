package JavaPractices;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {
	public static void main(String[] args) {
		TreeMap<Integer, String> studentData = new TreeMap<Integer, String>();
		studentData.put(1, "sachin");
		studentData.put(4, "Asha");
		studentData.put(3, "Kapil");
		studentData.put(5, "Sanvi");
		studentData.put(8, "Anvi");
		studentData.put(9, "Sapna");

		// not allowing single null key
		// studentData.put(null, "rohit");

		Set<Entry<Integer, String>> set = studentData.entrySet();

		for (Entry<Integer, String> e : set) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
