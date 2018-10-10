//https://dzone.com/articles/how-to-compare-list-objects-in-java-7-vs-java-8-1
package ListUsage;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListCompare {

	public static void main(String[] args) {

		//Create one Arrays as list
		List<String> list1 = Arrays.asList(new String[]
				{
						"Ashwini", "Hani", "Dhiren"
				});

		//Create another Arrays as list
		List<String> list2 = Arrays.asList(new String[] 
				{
						"Ashwini", "Hani", "Dhiren"
				});

		//Now Compare the list
		for(String listofitems : list1)
		{
			if(list2.contains(listofitems)) 
			{
				System.out.println("Match Found: "+listofitems);
			}
			else
			{
				System.out.println("Match Not Found: "+listofitems);
			}
		}

	}

}
