package Som.workspace.com;

import java.util.*;
public class SetUnion {
	
	int id ;
	String name;
	String desgination;
	
	public SetUnion(int id,String name, String desgination)
	{
		this.id=id;
		this.name=name;
		this.desgination=desgination;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating two sets 
		Set<SetUnion>set=new HashSet<SetUnion>();//set
		
		SetUnion s=new SetUnion(101,"som","SE");//values
		SetUnion s1=new SetUnion(102,"Sumit","SE");//values
		
		System.out.println("printing the set data");
		for(SetUnion s2:set)
		{
			System.out.println(s2.id+ "..." +s2.name+ "..." +s2.desgination);
		}
		
		set.add(s);//Adding the data's to set
		set.add(s1);//Adding the data's to set
		
		Set<SetUnion>set1=new HashSet<SetUnion>();//set1
		SetUnion b=new SetUnion(103,"Pushpa","SE");
		SetUnion b1=new SetUnion(104,"Ankur","SE");
		
		for(SetUnion s3:set1)
		{
			System.out.println(s3.id+ "..." +s3.name+ "..." +s3.desgination);
		}
		
		set1.add(b);//Adding the data's to set1
		set1.add(b1);//Adding the data's to set1
		
		Set union=new TreeSet(set);
		
		union.addAll(set1);//Now it contains the Union
		
		System.out.println("Union " +union);
		
		
		
		
	  
	    
   
	}

}
