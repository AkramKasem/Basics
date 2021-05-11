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
 		if(x<0)
 		System.out.println("the state of water is ice" );
 		if((x>0)&&(x<100))
 	    System.out.println("the state of water is liquid");
 		if(x>100)
 	    System.out.println("the state of water is water vapor");

 	}
 }
