package practice;

//         1
//       2 1 2
//     3 2 1 3 2
//   4 3 2 1 4 3 2
// 5 4 3 2 1 5 4 3 2
public class Star_5 {

	public static void main(String[] args) {
		 int n=5,i,j;
		 for(i=1;i<=n;i++) {
			 for(j=1;j<=n-i;j++) {
				 System.out.print("  ");
			 }
			 for(j=i;j>=1;j--) {
				 System.out.print(" "+j);
			 }
			 
				 for(j=i;j>1;j--) {//2
					 System.out.print(" "+j);
				 }
			 System.out.println();
		 }

	}

}
