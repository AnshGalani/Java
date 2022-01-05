interface calculate
{
	public double getvalue(double a,double b);
}
class square implements calculate
{
	public double getvalue(double a,double b)
	{
		return a*b;
	}
}
class cylinder implements calculate
{
	public double getvalue(double a,double b)
	{
		return 2*3.14*a*b;
	}
}
class InterfaceCalculateExample
{
	public static void main(String[] args)
	{
		square sqr=new square();
		cylinder cyl=new cylinder();
		System.out.println("Square: "+sqr.getvalue(5,3));
		System.out.println("Cylinder: "+cyl.getvalue(3,5));
	}
}