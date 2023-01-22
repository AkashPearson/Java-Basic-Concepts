package practice;
//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *
public class Star_3 {

	public static void main(String[] args) {
	 int n=5,i,j;
	 for(i=n;i>=1;i--) {
		 for(j=1;j<i;j++) {
			 System.out.print("  ");
		 }
		 for(j=5;j>=i;j--) {
		 System.out.print(" *");
		  }
		 for(j=1;j<i;j++) {
			 System.out.print(" *");
		 }
		 System.out.println();
		 }
	 }

	}


