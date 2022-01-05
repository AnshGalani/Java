public class CircleArea
{
	double pi=3.14;
	public double area (double r)
	{
		return (pi*r*r);
	}
	
	public double sir(double r)
	{
		return (pi*2*r);
	}
	public static void main(String[] args)
	{
		int r=Integer.parseInt(args[0]);
		CircleArea l=new CircleArea();
		System.out.println("Area is "+l.area(r));
		System.out.println("sir is "+l.sir(r));
	}
}