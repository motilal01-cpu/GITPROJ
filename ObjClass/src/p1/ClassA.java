package p1;

public class ClassA 
{
	void meth1()
	{
		System.out.println("meth1() called");
		
	}
	int meth2()
	{
		return 100;
	}

	public static void main(String[] args) 
	{
		ClassA obj1=new ClassA();
		ClassA obj2=new ClassA();
		
		int x=obj1.hashCode();
		int y=obj2.hashCode();
		
		System.out.println("obj1=" +x);
		System.out.println("obj2=" +y);
		
		System.out.println(new ClassA().hashCode());
		System.out.println(new ClassA().meth2());
		
		System.out.println("----------------");
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj1));
		System.out.println(obj1.equals(new ClassA()));
		System.out.println(new ClassA().equals(obj2));
		System.out.println(new ClassA().equals(new ClassA()));
	}

}
