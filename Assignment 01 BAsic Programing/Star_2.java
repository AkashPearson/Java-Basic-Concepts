package practice;
//      *
//    * *
//  * * *
//* * * *  
public class Star_2 {

	public static void main(String[] args) {
	 int s=5,i,j;
	 for(i=s;i>1;i--) {
		 for(j=1;j<i;j++) {
			 System.out.print(" _");
		 }
		 for(j=s;j>=i;j--) {
			 System.out.print(" *");
		 }
		 System.out.println();
	 }

	}

}
