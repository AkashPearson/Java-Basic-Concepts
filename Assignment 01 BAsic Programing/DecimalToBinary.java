import java.util.Scanner;
 class DecimalToBinary
 {
 	public static void main(String[] args) {
 		Scanner r = new Scanner(System.in);
 		System.out.println("Enter no");
 		int num=r.nextInt();
        /* int i=1;
         int bin=0;
 		while(num>0)
 		{
            int rem=num%2;
            bin=rem*i+bin;
            i=i*10;
            num=num/2;
 		
 	}
 	*/
 	 int dec=0,i=1,rem;
 		 
 		while(num>0)
 		{
 			rem=num%10;
 			dec=rem*i+dec;
 			i=i*2;
 			num=num/10;
 		}
 		System.out.println("Binary no is: "+dec);
 	}
 }