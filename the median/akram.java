import java.util.Scanner;
public class akram

{
	public static void main(String[] args)
	{
		System.out.println("found the median");
		Scanner s=new Scanner(System.in);
		int x,y,z;
		System.out.print("enter  x=    ");
		x = s.nextInt();
		System.out.print("enter  y=     ");
		y = s.nextInt();
		System.out.print("enter z=     ");
		z = s.nextInt();
		if((x>y)&&(y>z))
		System.out.println("the median is y=" + y);
		if((x>z)&&(z>y))
	    System.out.println("the median is z=" + z);
		if((y>x)&&(x>z))
	    System.out.println("the median is x=" + x);

	}
}
