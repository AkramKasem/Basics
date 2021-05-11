
import java.util.*;

public class palindrom {

	public static void main(String[] args)
	{
	System.out.println("welcome to calculater!");

        Scanner s = new Scanner(System.in);
        int r = 0,x;
	System.out.print("Enter x: ");
        x= s.nextInt();
        int u=x;
	while (x!=0)
	{ r=(r*10)+(x%10);
    	  x /= 10;
		}
		System.out.println("the reverse is  "+r);
	if (u==r)
                System.out.println(u+"is palindrom");
        else
                System.out.println(u+"is not palindrom");
	}
}



