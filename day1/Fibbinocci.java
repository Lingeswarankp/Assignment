package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {


		int firstNum=0;
		int secondNum=1;
		int sum=0;
		
		System.out.println("Here's the OP");
		System.out.println(" ");
		
		System.out.print(firstNum+secondNum);
		
		for(int i=0;i<=56;i++)
		{
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
			if(i<=11)
			{
				System.out.print(","+sum);
			}
			
		}
		
	
		
		
		
		

	}

}