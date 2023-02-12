package abstraction_in_Java;


class vehicle{
	final void speed()
	{
		System.out.println("The speed is: 140km/hr.");
	}
}
public class FinalKeywordDemo extends vehicle{

	final int a=140;
	
	public static void main(String[] args) {

		FinalKeywordDemo demo = new FinalKeywordDemo();
		System.out.println(demo.a);
		demo.speed();
	}

}