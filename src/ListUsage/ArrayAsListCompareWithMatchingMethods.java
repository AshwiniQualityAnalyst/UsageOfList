package ListUsage;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListCompareWithMatchingMethods {

	public static void main(String[] args) {

		//Create one Arrays as list
		List<String> list1 = Arrays.asList(new String[]
				{
						"Ashwini", "Hani", "Dhiren", "C", "D"
				});

		//Create another Arrays as list
		List<String> list2 = Arrays.asList(new String[] 
				{
						"Ashwini", "Hani", "Dhiren", "C", "D"
				});

		//Now Compare the list with conditions

		//Syntax------   list1.stream().anyMatch(x->list2.contains(x));
		System.out.println("If any item from list1 is present in list2");
		System.out.println(list1.stream().anyMatch(listofitems -> list2.contains(listofitems)));

		//Syntax------   list1.stream().noneMatch(x->list2.contains(x));
		System.out.println("If any item from list1 is not present in list2");
		System.out.println(list1.stream().noneMatch(listofitems -> list2.contains(listofitems)));

		//Syntax------   list1.stream().allMatch(x->list2.contains(x));
		System.out.println("If all the items from list1 is present in list2");
		System.out.println(list1.stream().allMatch(listofitems -> list2.contains(listofitems)));
	}

}
