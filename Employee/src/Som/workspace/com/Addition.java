package Som.workspace.com;
import java.util.*; //Scanner class 
public class Addition {

	//class ?
	//object 
	public int first=10;//variable declartion class level variable declaration 
	//instance variable . 
	public int second=20;//data's 
	public int sum;//variable 
	
	public void Sum()//method
	{
		//void is a datatype it is inbuilt datatype. It doesn't return any value
		// to the o/s ==jvm 
		//interpreter which converts our .java then to .class then to .exe.//byte code
		//jvm is platform dependent it's byte code is plateform independent 
		//WORA concept write once read anywhere.
		//member methods 
		sum=first+second;
		
		final int s1;
		
	}
	
	public void displaysum()
	{
		System.out.println("The sum of two numbers is " +sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj=new Addition();
		obj.Sum();
		obj.displaysum();
		
		//local variable 
		
		int a;
		int b;
		int sum1;
		String s1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter your string");
		s1=sc.next();
		
		
		sum1=a+b;
		System.out.println(sum1);
		System.out.println(s1);

	}

}
