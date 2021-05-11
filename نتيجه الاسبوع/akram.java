import java.util.Scanner;
public class akram

{
	public static void main(String[] args)
	{
		System.out.println("found the median");
		Scanner s=new Scanner(System.in);
		int x;
		System.out.print("enter  x=    ");
		x = s.nextInt();
		if(x==1)
		System.out.println("saturday");
		if(x==2)
		System.out.println("sunday");
		if(x==3)
		System.out.println("monday");
		if(x==4)
		System.out.println("tuesday");
		if(x==5)
		System.out.println("wednesday");
		if(x==6)
		System.out.println("thursday");
		if(x==7)
		System.out.println("friday");
	}
}
