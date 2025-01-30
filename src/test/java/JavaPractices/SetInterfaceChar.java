package JavaPractices;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Integer> set = new HashSet<Integer>();
set.add(10);
set.add(50);
set.add(30);
set.add(40);
set.add(10);
for(Integer s: set) {
	
	System.out.println(s);
}

	}

}
