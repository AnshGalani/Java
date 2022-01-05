interface Example
{
	public static int i=0;
	public static String s="Interface Demo Example";
	char c='c';
	String arr[]={"a1","b2","c3","d4","e5"};
}
public class MainClassInterface implements Example
{
	public static void main(String[] args)
	{
		System.out.println("Value of i is "+i);
		System.out.println("Value of s is "+s);
		System.out.println("Value of c is "+c);
		System.out.println("array value of index  "+arr[2]);
		
	}
}
