package Som.workspace.com;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++){
			for(int j=0;j<=4;j++){
				if(i+j==2){
					System.out.print("a");
				}
				else if(i+j==6)
				{
					System.out.print("a");	
				}
				else if(i==3&&j==1||i==1&&j==3)
				{
					System.out.print("a");
				}
				else if(i==2&&j==1||i==1&&j==2||i==2&&j==3||i==3&&j==2)
				{
					System.out.print("b");
				}
				
				else if(i==2&&j==2)
				{
					System.out.print("c");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}

	}

}
