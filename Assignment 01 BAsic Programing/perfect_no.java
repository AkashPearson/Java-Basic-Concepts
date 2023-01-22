// input=6--->  1 2 3 4 5
// 6= 1+2+3=6
import java.util.Scanner;
class perfect_no
{

	public static void main(String[] args) {
		int n,s=0;
		System.out.print("Enter any no: ");
		Scanner r=new Scanner(System.in);
	    n=r.nextInt();
	    for(int i=1;i<n;i++)
	    {
	    	if(n%i==0)
	    		s=i+s;
	    }
	    if(s==n)
	    {
	    	System.out.print("perfect no");
	    }
	    else{
	    	System.out.print("not perfect");
	    }

	}
}