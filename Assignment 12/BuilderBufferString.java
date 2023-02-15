package array;

public class BuilderBufferString {

	public static void main(String[] args) {
		char[] ch = {'h','a','r','x','y','k','o'};
		String s = new String(ch);
		System.out.println(ch);
		
		String name = "Akash";
		String name1 = "Kumar"; //it doesnot create a new instance
		System.out.println(name==name1);
		String str = "Pearson";
		System.out.println(name==str);
		name = name.concat(str);	//joins the string
		System.out.println(name.length());
		
		String msg = "Good Morning Buddy";
		
		char c = msg.charAt(0);	//0--> index 
		System.out.println(c);
		
		String s1 = new String("Aniket");
		String s2 = new String("Animesh");
		String s3 = new String("Anyee");
		String s4 = new String("Pearson");
		String s5 = new String("Jagdamba");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s4.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		
		String a ="Hello Java";
		System.out.println(a.contains("Java"));
		System.out.println(a.endsWith("e"));
		
	/*
		Student stu1 = new Student(1,"Akash","Pearson");	//roll;fname,lname
		Student stu2 = new Student(2,"Vishwa","Guru");
	*/	
		//String Builder
		
		StringBuilder builder = new StringBuilder("Hello World");	//mutable
		builder.append(" i am learning Java.");
		System.out.println(builder);
		builder.insert(11, ",");
		System.out.println(builder);
		builder.replace(13, 17, "I Love");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		StringBuilder hello = new StringBuilder("Hello");
		hello.delete(1, 3);
		System.out.println(hello);
		
		
		//String Buffer
		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer.capacity());
		buffer.append(" Java i love programming");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		buffer.insert(10, ",");
		System.out.println(buffer);
		System.out.println(buffer.indexOf("love"));
		
		//substring can be done in two ways
		System.out.println(buffer.substring(14));	//start index
		System.out.println(buffer.substring(6, 10));	//start end index
		buffer.delete(6, 10);
		System.out.println(buffer);
	}

}