package readfile.acadgild.com;

public class Sumit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String ?
		//where is it present ?
		//why we should read String ?
		//String is an Object // String a datatype // String is a class
		//java.lang.String //Object class //String a class which create an object , it is sequence of char.
		//String Literals and new keyword 
		//String objects are always imuteable 
		
//		String s="Sumit"; //Stack area 
//		String s1="sumit";
//		String s2,s3;
//		
//		s2=s;
//		s=s.concat("acadgild");
//		
//		System.out.println();
//		
//		//System.out.println(s3);//sumitacadgild ?//sumit 
//		
//		System.out.println(s);
//		
//		
//		 System.out.println(s.hashCode());
//		 System.out.println(s1.hashCode());
//		 System.out.println(s2.hashCode());
//		 String ss=new String("Sumit");
//		 System.out.println(ss.hashCode());
//		 
//		 System.out.println(s==ss);//false
//		 System.out.println(s.equals(ss));//true
//		 
		 
		  String s1="sachin";
		  s1.concat("Tendulkar");
		  System.out.println(s1);//you are not creating new instance although you are concating
		
             StringBuffer s=new StringBuffer("Sachin");
             s.append("Tendulkar");
             System.out.println(s);//The object is mutable since we change. 
             
             StringBuilder ss=new StringBuilder("Sachin");
             ss.append("Tendulkar");
             System.out.println(ss);
	}

}
