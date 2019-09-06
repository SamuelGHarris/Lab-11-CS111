/**
* CS 111 Section No. 002 
* Lab Assignment 11
* @author Samuel Harris
**/

public class Tester {
	public static void main(String args[]) {
		MyArrayList<String> a1 = new MyArrayList<String>();
		MyArrayList<Integer> a2 = new MyArrayList<Integer>();

		System.out.println("Unordered List - String\n");

		System.out.println("The structure is currently empty. (true)");
		System.out.println("\"The list is empty\" appears when trying to display a list with 0 elements.");
		System.out.println(a1.empty());
		a1.display();
		System.out.println();

		System.out.println(
				"\n\"The list is empty\" appears when trying to remove an element from a list with 0 elements.");
		a1.remove("George");

		System.out.println("\nAdding and displaying elements until base structure is filled.");
		a1.add("James");
		a1.display();
		System.out.println();
		a1.add("Fred");
		a1.add("Jesse");
		a1.display();
		System.out.println();
		a1.add("Kyle");
		a1.add("Ben");
		a1.display();
		System.out.println();

		System.out.println("\nThis statement prints true which rightfully shows that the structure is full.");
		System.out.println(a1.full());

		System.out.println("\nThe size at this point is 5");
		System.out.println(a1.size());

		System.out.println("\nAdding another element forces the structure to double in size.");
		System.out.println("The structure is no longer full (false).");
		a1.add("Sam");
		a1.display();
		System.out.println();
		System.out.println(a1.full());

		System.out.println("\nThe empty method returns false.");
		System.out.println(a1.empty());

		System.out.println("\nJames is removed and Sam is moved to the position that James had.");
		a1.remove("James");
		a1.display();
		System.out.println();

		System.out.println("\nAttempting to remove an element that is not present.");
		System.out.println("The list of names remains the same.");
		a1.remove("George");
		a1.display();
		System.out.println();

		System.out.println("\nAttempting to remove and item when 0 items are present");
		a1.remove("Sam");
		a1.remove("Fred");
		a1.remove("Jesse");
		a1.remove("Kyle");
		a1.remove("Ben");
		a1.remove("Charles");
		a1.display();
		System.out.println();

		System.out.println("\nClearing the list.");
		a1.clear();
		a1.display();
		System.out.println();

		System.out.println("\n_____________________________________________________\n");
		System.out.println("Unordered List - Integer\n");

		System.out.println("The structure is currently empty. (true)");
		System.out.println("\"The list is empty\" appears when trying to display a list with 0 elements.");
		System.out.println(a1.empty());
		a2.display();
		System.out.println();

		System.out.println(
				"\n\"The list is empty\" appears when trying to remove an element from a list with 0 elements.");
		a2.remove(1);

		System.out.println("\nAdding and displaying elements until base structure is filled.");
		a2.add(1);
		a2.display();
		System.out.println();
		a2.add(2);
		a2.add(3);
		a2.display();
		System.out.println();
		a2.add(4);
		a2.add(5);
		a2.display();
		System.out.println();

		System.out.println("\nThis statement prints true which rightfully shows that the structure is full.");
		System.out.println(a2.full());

		System.out.println("\nThe size at this point is 5");
		System.out.println(a2.size());

		System.out.println("\nAdding another element forces the structure to double in size.");
		System.out.println("The structure is no longer full (false).");
		a2.add(6);
		a2.display();
		System.out.println();
		System.out.println(a2.full());

		System.out.println("\nThe empty method returns false.");
		System.out.println(a2.empty());

		System.out.println("\n1 is removed and 6 is moved to the position that James had.");
		a2.remove(1);
		a2.display();
		System.out.println();

		System.out.println("\nAttempting to remove an element that is not present.");
		System.out.println("The list of names remains the same.");
		a2.remove(23);
		a2.display();
		System.out.println();

		System.out.println("\nAttempting to remove and item when 0 items are present");
		a2.remove(6);
		a2.remove(2);
		a2.remove(3);
		a2.remove(4);
		a2.remove(5);
		a2.remove(10);
		a2.display();
		System.out.println();

		System.out.println("\nClearing the list.");
		a2.clear();
		a2.display();
		System.out.println();
	}
}
