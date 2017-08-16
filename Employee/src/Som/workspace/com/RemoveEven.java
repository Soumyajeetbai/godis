package Som.workspace.com;

import java.util.List;
import java.util.*;

public class RemoveEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(111);
		numbers.add(451);
		numbers.add(122);
		numbers.add(322);
		numbers.add(316);

		System.out.println("Unsorted List: " + numbers);

		for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
		    Integer number = iterator.next();
		    if (number % 2 == 0) {
		        System.out.println("This is Even Number: " + number);
		        iterator.remove();
		    }

		}

		Collections.sort(numbers);
		System.out.println("Sorted List: " + numbers);

	}

}
