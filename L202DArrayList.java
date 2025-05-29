package l7mathClass;

import java.util.*;

// 2d arraylist = a dynamic list of lists (you can change the size of these lists during runtime)
public class L202DArrayList {

	public static void main(String[] args) {
		// create a list of separate shopping lists
		
		
		// grocery list (contains all)
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		// 1. bakery arraylist
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("donuts");
		bakeryList.add("garlic bread");
		
		System.out.println(bakeryList);
		
		// 2. produce arraylist
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		System.out.println(produceList);
		
		// 3. drink arraylist
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		System.out.println(drinksList);
		
		// add 3 arraylists to the grocery list
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));

	}

}
