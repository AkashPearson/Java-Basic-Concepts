// 0 + 1 + 1 + 2 + 3 + 5 + 8 + 1 3 + 21+ ....
import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) {
		int terms,a=0,b=1,c;
		System.out.print("enter terms");
		Scanner r=new Scanner(System.in);
		terms=r.nextInt();
		for(int i=1;i<=terms;i++)
		{		
			System.out.print(a+" ");
		   c=a+b;
		   a=b;
		   b=c;
		}

		
	}
}