package ListUsage;

import java.util.ArrayList;
import java.util.List;

public class CompareListUsingForLoop {

	public static void main(String[] args) {
		//Create one list
		List<String> list1 = new ArrayList<String>();
		list1.add("Ashwini");
		list1.add("Hani");
		list1.add("Dhiren");

		//Create another list
		List<String> list2 = new ArrayList<String>();
		list2.add("Ashwini");
		list2.add("Hani");
		list2.add("Dhiren");

		//Now Compare the list using for loop

		for(int i=0; i<list1.size(); i++)
		{
			//Syntax------------list1.get(i).equals(list2.get(i));---For Assertion Purpose
			System.out.println(list1.get(i).trim().equals(list2.get(i).trim()));
		}

	}

}
