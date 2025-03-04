package p1;

public class ClassA {
	ClassA()
	{
		 System.out.println("Non-parameterized constructor called");
		 new ClassA("java").meth2();
	}
		 ClassA(String s)//java
		 {
			 System.out.println(s);
		 }
	ClassA(int a,int b)
	{
		System.out.println(a+b);
	}
	void meth1()
	{
		System.out.println("meth1()called");
	}
	void meth2()
	{
		System.out.println("meth2()called");
		new ClassA(99,1);
	}

	public static void main(String[] args) 
	{
		ClassA ob=new ClassA();
		ob.meth1();
		
	}

}
