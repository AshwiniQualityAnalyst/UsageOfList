package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class WaysToIterateArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		System.out.println("Way 1 to iterate");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Way 2 to iterate");
		for (String LIST : list) {
			System.out.println(LIST);
		}

		System.out.println("Way 3 to iterate");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Way 4 to iterate");
		list.forEach(lambdaexpression -> {
			System.out.println(lambdaexpression);
		});

	}

}
