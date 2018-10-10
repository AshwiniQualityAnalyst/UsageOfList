package ListUsage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCompareWithMatchingMethods {

	public static void main(String[] args) {

		//Create one Arrays as list
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);


		//Create another Arrays as list
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);


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
