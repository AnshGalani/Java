public class RectangleArea
{
	int length;
	int width;
	public int area(int l,int w)
	{
		length=l;
		width=w;
		return(length*width);
	}
	public static void main(String[] args)
	{
		int l=Integer.parseInt(args[0]);
		int w=Integer.parseInt(args[1]);
		RectangleArea r=new RectangleArea();
		System.out.println("area of Rectangle is "+r.area(l,w));
		
	}
}