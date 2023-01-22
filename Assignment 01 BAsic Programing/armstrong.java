// input 153 = 1*1*1+5*5*5+3*3*3=153
import java.util.Scanner;
class armstrong
{
	public static void main(String[] args) {
        int num,rem,arm=0,c;
		System.out.println("enter no");
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		c=num;
		while(num>0)
		{
			rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
		}
		if(c==arm)
		{
          System.out.println("Armstrong no");
		}
		else
			System.out.println("not armstrong");
	}
}