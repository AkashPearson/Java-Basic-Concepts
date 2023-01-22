class Fibonacci
{
	public static void main(String[] args) {
		int terms,a=0,b=1,c;
		System.out.print("enter terms");
		Scanner r=new Scanner(System.in);
		terms=r.nextInt();
		for(int i=1;i<=terms;i++)
		{
		   c=a+b;
		   a=b;
		   b=c;
		}

		System.out.println(c+" ");
	}
}