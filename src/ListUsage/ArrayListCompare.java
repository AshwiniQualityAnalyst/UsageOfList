package ListUsage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompare 
{
	public static void main(String[] args) 
	{
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

		//Now Compare the list
		for(String listofitems : list1)
		{
			// Useful during Assertions
			if(list2.contains(listofitems))
			{
				System.out.println("Match found: "+listofitems);
			}
			else
			{
				System.out.println("Match not found: "+listofitems);
			}
		}
	}

}
