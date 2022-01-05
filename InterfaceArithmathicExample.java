// WRITE A PROGRAM TO CALCULAT ARITHMATHIC OPRATION (+,-,*,/) USING INTERFACE
interface airthmathic
{
	public int getvalue(int a,int b);
}
class addition implements airthmathic
{
	public int getvalue(int a,int b)
	{
		return a+b;
	}
}
class subtraction implements airthmathic
{
	public int getvalue(int a,int b)
	{
		return a-b;
	}
}
class multiplication implements airthmathic
{
	public int getvalue(int a,int b)
	{
		return a*b;
	}
}
class division implements airthmathic
{
	public int getvalue(int a,int b)
	{
		return a/b;
	}
}

class InterfaceArithmathicExample
{
	public static void main(String[] args)
	{
		addition add=new addition();
		subtraction sub=new subtraction();
		multiplication mul=new multiplication();
		division div=new division();
		
		System.out.println("Addition is "+add.getvalue(5,2));
		System.out.println("Subtraction is "+sub.getvalue(5,2));
		System.out.println("Multiplication is "+mul.getvalue(5,2));
		System.out.println("Division is "+div.getvalue(5,2));
	}
}
 