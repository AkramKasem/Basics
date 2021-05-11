

import java.util.*;

public class akram
{
	public static void main(String[] args)
	{
        System.out.println("welcome to calculater!");
        int sum=0, x ,r=1,A,t=1,y=1,w=1,z=1,e=1,P=1 ;
        Scanner s = new Scanner(System.in);

         System.out.print("Enter x: ");

        do{x= s.nextInt();
             int u=x;
	while (x!=0)
	{ r=(r*10)+(x%10);
    	  x /= 10;
		}
		System.out.println("the reverse is  "+r);

	if (u==r)
        {System.out.println(u+"is palindrom");
            z++; }
        else
        {System.out.println(u+"is not palindrom");
          e++;}
        if (x%2==0)
           {System.out.println("the number "+x+" is even");
             y++;}
        else
           {System.out.println("the number "+x+" is odd");
             t++;}
        if (x<0)
           { System.out.println("the number "+x+" is negative");
               w++; }
           sum=sum+x;
            P++;}
        while (x!=0);
         System.out.println ("the sum is "+sum +"  the number of read is "+P  );
            System.out.println("the number of odd is "+t);
            System.out.println("the number of even is "+y);
            System.out.println("the number of negative is "+w);
              System.out.println("the number of palindrom is "+z);
            System.out.println("the number of non palindrom is "+e);
         A=sum/r;
            System.out.println("the avrage is "+A);

	}
}


