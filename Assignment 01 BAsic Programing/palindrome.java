// input number = 121  ---> 121

import java.util.Scanner;
class palindrome
{
	public static void main(String[] args) {
		int n,c,r,s=0;
		System.out.println("enter any no");
		Scanner ok=new Scanner(System.in);
		n=ok.nextInt();
        c=n;
        while(n>0)
        {
        	r=n%10;
        	s=(s*10)+r;
        	n=n/10;
        }
        if(c==s)
        {
        	System.out.println("Given no is Palindrome number");
        }
        else{
        	System.out.print("given no is not Palindrome");
        }
	}
}