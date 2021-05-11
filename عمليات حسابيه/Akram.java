package akram;
import java.util.*;

public class Akram
{
	public static void main(String[] args)
	{
		System.out.println("welcome to calculater!");

        Scanner input = new Scanner(System.in);
        double x,y,z,w,r;
		System.out.println("1-summation x,y");
		System.out.println("2-subtracted x,y");
		System.out.println("3-Multiplication x,y");
		System.out.println("4-Dividing x,y");
		System.out.println("5-power x,y");
		System.out.println("6-sqrt x,y");

		System.out.print("Enter x: ");
		x= input.nextDouble();

		System.out.print("Enter y: ");
		y= input.nextDouble();

		System.out.print("Enter type of calculater: ");
		w= input.nextDouble();

		if (w==1)
		{
			System.out.println("the type of calculater is summation ");
			z=x+y;
			System.out.print("the result is"+z);
		}

		if (w==2)
		{
			System.out.println("the type of calculater is subtracted");
			z=x-y;
			System.out.print("the result is"+z);
		}

		if (w==3)
		{
			System.out.println("the type of calculater is Multiplication");
			z=x*y;
			System.out.print("the result is"+z);
		}

		if (w==4)
		{
			System.out.println("the type of calculater is Dividing");
			z=x/y;
			System.out.print("the result is"+z);
		}

		if (w==5)
		{
			System.out.println("the type of calculater is power");
			z=Math.pow( x,y);
			System.out.print("the result is"+z);
		}

		if (w==6)
		{
			System.out.println("the type of calculater is sqrt");
			z=Math.sqrt( x);
			r=Math.sqrt( y);
			System.out.print("the result is"+z);
		}


	}
}



