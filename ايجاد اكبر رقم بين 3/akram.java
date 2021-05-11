import java.util.Scanner;
public class akram

{
	public static void main(String[] args)
	{
		System.out.println("found the max");
		Scanner s=new Scanner(System.in);
		int x,y,z;
		System.out.print("enter  x=    ");
		x = s.nextInt();
		System.out.print("enter  y=     ");
		y = s.nextInt();
		System.out.print("enter z=     ");
		z = s.nextInt();
		if (x > y)
			if (x > z)
				System.out.println("the max is x=" + x);
			else
				System.out.println("the max is z=" + z);
		else
		     if (y > z)
			     System.out.println("the max is y=" + y);
		     else
			     System.out.println("thr max is z=" + z);
	}
}
