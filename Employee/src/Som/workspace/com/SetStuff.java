package Som.workspace.com;

	import java.util.*;

	/** Show the union and instersection of two sets. */
	public class SetStuff {
	  public static void main(String[] args) {

	    // Create two sets.
	    Set s1 = new HashSet();
	    s1.add("Som");
	    s1.add("Sachin");
	    s1.add("Rohan");

	    Set s2 = new HashSet();
	    s2.add("Rohit");
	    s2.add("Dravid");

	    Set union = new TreeSet(s1);
	    union.addAll(s2);    // now contains the union

	    print("union", union);

	
	  }

	  protected static void print(String label, Collection c) {

	    System.out.println("--------------" + label + "--------------");

	    Iterator it = c.iterator();
	    while (it.hasNext()) {
	      System.out.println(it.next());
	    }
	  }
	}


