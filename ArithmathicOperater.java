public class ArithmathicOperater
{
	
	public int add(int a,int b)
	{
		return(a+b);
	}
	
	public int sub(int a,int b)
	{
		return(a-b);
	}
	
	public int mul(int a,int b)
	{
		return(a*b);
	}
	
	public int div(int a,int b)
	{
		return(a/b);
	}
	
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		ArithmathicOperater l=new ArithmathicOperater();
		System.out.println("add is "+l.add(a,b));
		System.out.println("sub is "+l.sub(a,b));
		System.out.println("mul is "+l.mul(a,b));
		System.out.println("div is "+l.div(a,b));
	}
}