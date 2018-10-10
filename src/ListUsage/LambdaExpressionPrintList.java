package ListUsage;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionPrintList {

	public static void main(String[] args) {
		//Create one list
		List<String> list1 = new ArrayList<String>();
		list1.add("Ashwini");
		list1.add("Hani");
		list1.add("Dhiren");

		//Lambda expressions
		list1.forEach(listofitems -> System.out.println(listofitems));

	}

}
