import java.util.Scanner;
public class akram
{
	public static void main(String[] args)
	{
		System.out.println("found the max");
		Scanner s=new Scanner(System.in);
		int x,y,z,m;
		System.out.print("enter  x=    ");
		x = s.nextInt();
		System.out.print("enter  y=     ");
		y = s.nextInt();
		System.out.print("enter z=     ");
		z = s.nextInt();
		System.out.print("enter m=     ");
		m=s.nextInt();
		if (x > y)
			if (x > z)
			    if (x>m)
				System.out.println("the max is x=" + x);
				else
				System.out.println("the max is m=" + m);
			else
			    if (z>m)
				System.out.println("the max is z=" + z);
				else
				System.out.println("the max is m=" + m);
		else
		     if (y > z)
		         if (y>m)
			     System.out.println("the max is y=" + y);
			     else
			     System.out.println("the max is m=" + m);
		     else
		         if (z>m)
			     System.out.println("thr max is z=" + z);
			     else
			     System.out.println("the max is m=" + m);
	}
}
