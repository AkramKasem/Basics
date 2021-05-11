
import java.util.*;

public class reverse
{
	public static void main(String[] args)
	{
		System.out.println("welcome to calculater!");

        Scanner s = new Scanner(System.in);
        int x,w,r = 0;

		System.out.print("Enter x: ");
		x= s.nextInt();
	int u=x;
	while (x!=0)
	{ r=(r*10)+(x%10);
    	  x /= 10;
		}
		System.out.println ("the reverse is  "+r);
	if (u==r)
                System.out.println("the"+u+"is palindrom");
        else
                System.out.println("the"+u+"is not palindrom");
	}
}



