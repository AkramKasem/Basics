import java.util.Scanner;
public class akram
{
	public static void main(String[] args)
	{
		int x,y,z,g;
		Scanner s=new Scanner(System.in);
		System.out.print("the max is the");
		System.out.print("enter x=   ");
		x=s.nextInt();
		System.out.print("enter y=   ");
		y=s.nextInt();
		System.out.print("enter z=   ");
		z=s.nextInt();
		System.out.print("enter g=   ");
		g=s.nextInt();
		if ((x>y)&&(x>z)&&(x>g)&&(z>y)&&(z>g))
			{System.out.println("the max is x" + x);
			System.out.println("the before is z" + z);}
		if ((x>y)&&(x>z)&&(x>g)&&(y>z)&&(y>g))
			{System.out.println("the max is x" + x);
			 System.out.println("the before is y" + y);}
		if ((x>y)&&(x>z)&&(x>g)&&(g>z)&&(g>y))
			{System.out.println("the max is x" + x);
			 System.out.println("the before is g" + g);}


		if ((y>x)&&(y>z)&&(y>g)&&(z>x)&&(z>g))
			{System.out.println("the max is y" + y);
			System.out.println("the before max is z" + z);}
		if ((y>x)&&(y>z)&&(y>g)&&(x>z)&&(x>g))
			{System.out.println("the max is y" + y);
			 System.out.println("the before is x" + x);}
		if ((y>x)&&(y>z)&&(y>g)&&(g>z)&&(g>y))
			{System.out.println("the max is y" + y);
			 System.out.println("the before is g" + g);}


		if ((z>x)&&(z>y)&&(z>g)&&(x>y)&&(x>g))
			{System.out.println("the max is z" + z);
			System.out.println("the before max is x" + x);}
		if ((z>x)&&(z>y)&&(z>g)&&(g>y)&&(g>x))
			{System.out.println("the max is z" + z);
			 System.out.println("the before is g" + g);}
		if ((z>x)&&(z>y)&&(z>g)&&(y>x)&&(y>g))
			{System.out.println("the max is z" + z);
			 System.out.println("the before is y" + y);}


		if ((g>x)&&(g>y)&&(g>z)&&(x>y)&&(x>z))
			{System.out.println("the max is g" + g);
			System.out.println("the before max is z" + z);}
		if ((g>x)&&(g>y)&&(g>z)&&(y>z)&&(y>x))
			{System.out.println("the max is g" + g);
			 System.out.println("the before is y" + y);}
		if ((g>x)&&(g>y)&&(g>z)&&(z>x)&&(z>y))
			{System.out.println("the max is g" + g);
			 System.out.println("the before is z" + z);}


		 }
}
