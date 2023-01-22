package practice;

 

public final class Lcm {

	public static void main(String[] args){
		/* Scanner r =new Scanner(System.in);
		 System.out.println("Enter an number");
		  num=r.nextInt();
			 int sum=0;
			 for(int i=1;i<=num;i++) 
			{
				 //for odd---->//1+3+5+7+9
				if(i%2!=0) {
					sum +=i;
				} 
				//for even //0+2+4+6+8+10
				// if(i%2==0) {
			      //sum = sum+i;
				 //}
			 
			}
			 System.out.print(" sum of given natural no is"+ sum);
			 */
		int i=7;
		int j=5;
		for(int num=1;true;num++)
		{
		  if(num%i==0 && num%j==0)
		  {
			  System.out.println("Lcm of the no is: "+num);
			  return;
		  }
		}
		}
	}






