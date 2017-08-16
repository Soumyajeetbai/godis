package readfile.acadgild.com;




public class Test {
	
	int x1,y1;
	
	public Test()
	{
        System.out.println("heeloooo");//this is a special keyword which refers to the current instance of a class 
	}
	
	public Test(int x,int y){
		x1=x;
		y1=y;
		
		
		
	}
	
	void disp()
	{
		System.out.println(x1 + ".." +y1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  
		 //hashcode i.e memory location or it's logical address
		Test obj1=new Test(10,20);
		obj1.disp();
	}

}
