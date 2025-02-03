package p1;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA
{
	
	void meth1()
	{
		System.out.println("Implementiong an array");
		int arr1[];
		arr1=new int[5];
		
		int arr2[]=new int[4];
		
		int arr3[]= {100,200,300};
		
		int arr4[]=new int[] {11,22,33,44,55,66};
		
		String s="java";
		
		System.out.println("String length:"+s.length());
		System.out.println("arr1 length:"+arr1.length);
		System.out.println("arr2 length:"+arr2.length);
		System.out.println("arr3 length:"+arr3.length);
		System.out.println("arr4 length:"+arr4.length);
		
		System.out.println("==========================");
		System.out.println("0th index position value:"+arr1[0]);
		//System.out.println(arr[5]);//exception an AIOB 
		System.out.println("last index position value:"+arr1[4]);
		System.out.println("Last index positon value:"+arr1[arr1.length-1]);
		System.out.println("===========================");
		
		//[0,20,30,0,50]
		
		arr1[1]=20;
		arr1[2]=30;
		arr1[4]=50;
		
		System.out.println("arr1:"+Arrays.toString(arr1));
		System.out.println("arr2:"+Arrays.toString(arr2));
		System.out.println("arr3:"+Arrays.toString(arr3));
		System.out.println("arr4:"+Arrays.toString(arr4));
		
		//Arrays.toString(arrayName):is used to display the content present in an array
		
		System.out.println("============================");
		System.out.println(arr2[arr1.length-3]);
		System.out.println(arr3[arr2.length-arr3.length]);
		System.out.println(arr4[arr4.length-2]);
	}
		
		void meth2()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("How many tickets you need?");
			String names[]=new String[sc.nextInt()];
			System.out.println("Please enter:"+names.length+"names");
			for(int i=0;i<names.length;i++)
			{
				names[i]=sc.next();
			}
			System.out.println("Your tickets were booked for");
			System.out.println(Arrays.toString(names));
			System.out.println("=========================");
			System.out.println("Retriving the data from an array by using for loop");
			for(int i=0;i<names.length;i++)
			{
				System.out.println(names[i]);
			}
			System.out.println("Retriving the data from an array  in reverse order by using for loop");
			for( int i=names.length-1;i>=0;i--)
			{
				System.out.println(names[i]);
			}
			System.out.println("Retriving the data from an array in reverse order by using for-each loop");
			for(String data:names)
			{
				System.out.println(data);
			}
			sc.close();
		
	}

	public static void main(String[] args) 
	{
		ClassA ob=new ClassA();
		ob.meth1();
		ob.meth2();
	}

}
