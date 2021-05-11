import java.util.Scanner;
public class akram
{
	public static void main(String[] args)
	{
		int x,y,z,g,k,j,f,u;
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
		System.out.print("enter k=   ");
		k=s.nextInt();
		System.out.print("enter j=   ");
		j=s.nextInt();
		System.out.print("enter f=   ");
		f=s.nextInt();
		System.out.print("enter u=   ");
		u=s.nextInt();
		if ((x>y)&&(x>z)&&(x>g)&&(x>k)&&(x>j)&&(x>f)&&(x>u))
			System.out.println("the max is x" + x);
		if ((z>y)&&(z>x)&&(z>g)&&(z>k)&&(z>j)&&(z>f)&&(z>u))
			System.out.println("the max is z" + z);
	    if ((y>x)&&(y>z)&&(y>g)&&(y>k)&&(y>j)&&(y>f)&&(y>u))
		    System.out.println("the max is y" + y);
	    if ((g>x)&&(g>z)&&(g>y)&&(g>k)&&(g>j)&&(g>f)&&(g>u))
		    System.out.println("the max is g" + g);
		if ((k>x)&&(k>z)&&(k>g)&&(k>y)&&(k>j)&&(k>f)&&(k>u))
		    System.out.println("the max is k" + k);
	    if ((j>x)&&(j>z)&&(j>g)&&(j>k)&&(j>y)&&(j>f)&&(j>u))
		    System.out.println("the max is j" + j);
		if ((f>x)&&(f>z)&&(f>g)&&(f>k)&&(f>j)&&(f>y)&&(f>u))
		    System.out.println("the max is f" + f);
		if ((u>x)&&(u>z)&&(u>g)&&(u>k)&&(u>j)&&(u>f)&&(u>y))
		    System.out.println("the max is u" + u);
			System.out.println("thank you for Dr Amr because he teach our very good");

		}
}
