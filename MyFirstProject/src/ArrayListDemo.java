import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList arraylist=new ArrayList();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add("Om");
		arraylist.add(30);
		arraylist.add(1, "Ram");
		arraylist.add(2,"Sita");
		System.out.println(arraylist);
	}

}
