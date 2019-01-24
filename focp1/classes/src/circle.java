import java.util.scanner;
public class circle
{
	double radius;
	double findArea()
	{
		double area;
		area=3.14*radius*radius;
		return area;
	}
    void diaplayArea()
	{ 
		double area;
		area=findArea();
		System.out.println(area);
	}
}

Class circledemo
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.radius=2;
		c.displayArea();
	}
}