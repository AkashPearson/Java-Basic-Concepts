package abstraction_in_Java;



interface Printable{	//first interface
	int x=555;		//automatically declared as public static final
	public void display();
	void fun();
}

interface Drawable extends Printable{
	void draw();
	void speak();
}

interface Speakable{
	void say();
	int x=500;
}

class Print implements Drawable{

	@Override
	public void display() {
		System.out.println("Hello Display");
		
	}

	@Override
	public void fun() {
		System.out.println("This is Fun.");
	}

	@Override
	public void draw() {
		System.out.println("Draw Anything.");
	}

	@Override
	public void speak() {
		System.out.println(" Speak Anything");
	}
	
}

class Message implements Drawable,Speakable{

	@Override
	public void display() {
		System.out.println("Hello Display");
		
	}

	@Override
	public void fun() {
		System.out.println("This is Fun.");
	}

	@Override
	public void say() {
		System.out.println("This is Say.");
	}

	@Override
	public void draw() {
		System.out.println("Draw Anything ");
	}

	@Override
	public void speak() {
		System.out.println("  Speak Anything.");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {

		Print pri = new Print();
		pri.display();
		pri.draw();
		pri.fun();
		pri.speak();
		System.out.println("Value of x: "+Drawable.x);
		
		System.out.println();
		
		Message msg = new Message();
		msg.display();
		msg.fun();
		msg.say();
		msg.draw();
		msg.speak();
		System.out.println("Value of x: "+Speakable.x);
	}

}