import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ram");
		hs.add("Shyam");
		hs.add("Hanuman");
		hs.add("Arjun");
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(50);
		al.add(30);
		System.out.println(hs);
		Collections.sort(al);

	}

}
