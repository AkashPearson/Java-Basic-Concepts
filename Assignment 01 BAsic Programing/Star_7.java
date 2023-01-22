package practice;
//    * * * * *
//   *       *
//  *       *
// *       *
//* * * * *

public class Star_7 {

	public static void main(String[] args) {
		int i,j,n=5;
		 for(i=1;i<=n;i++) {
			 for(j=1;j<=n-i;j++) {
				 System.out.print("  ");
			 }
			 for(j=1;j<=n;j++) {
				 if(i==1 ||i==5 ||j==1 ||j==5) {
				 System.out.print(" *");}
				 else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }

	}

}
