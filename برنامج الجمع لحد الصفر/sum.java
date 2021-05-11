
import java.util.*;

public class sum
{
	public static void main(String[] args)
	{
        System.out.println("welcome to calculater!");
        int sum=0, x;
        Scanner s = new Scanner(System.in);

         System.out.print("Enter x: ");

        do{x= s.nextInt();
           sum=sum+x; }
        while (x!=0);
         System.out.println ("the sum is "+sum);

	}
}

