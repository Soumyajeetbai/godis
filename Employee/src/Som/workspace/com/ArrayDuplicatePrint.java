package Som.workspace.com;


import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 

public class ArrayDuplicatePrint {

	
	
	
	public static void main(String[] args) { 
	ArrayList<String> letters = new ArrayList<String>(); 
	HashMap<String, Integer> duplicateLetters = new HashMap<String, Integer>(); 
	ArrayList<String> newLetters = new ArrayList<String>(); 

	letters.add("som"); 
	letters.add("sumit"); 
	letters.add("sumit"); 
	letters.add("hitesh"); 
	letters.add("ankur"); 
	letters.add("som"); 
	letters.add("sachin"); 

	Iterator<String> iterator = letters.iterator(); 
	while (iterator.hasNext()) { 
	String next = iterator.next(); 
	if (newLetters.contains(next)) { 
	Integer value = duplicateLetters.get(next); 
	if (value == null) { 
	duplicateLetters.put(next, 1); 
	} 
	else { 
	duplicateLetters.put(next, value + 1); 
	} 
	} 
	else { 
	newLetters.add(next); 
	} 
	} 

	letters = newLetters; 

	System.out.println("Duplicate Letters:"); 
	for (Map.Entry<String, Integer> entry : duplicateLetters.entrySet()) { 
	System.out.println(entry.getKey()); 
	} 
	} 
	
}
