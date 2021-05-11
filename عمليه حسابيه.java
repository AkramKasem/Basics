import java.util.Scanner;
public class akram{
 public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int x,y,z=0;
 	System.out.print("Enter x: ");
 	x= input.nextInt();
    System.out.print("Enter y: ");
 	y= input.nextInt();
 	String e=s.next();
            switch(e){
                case + :{
	            	System.out.print("enter equation "+x+e+y);
	            	z=x+y;
	            	System.out.println("the result is"+z);
	            	 break;}
                case -:{
	            	System.out.print("enter equation "+x+e+y);
					z=x-y;
					System.out.println("the result is"+z);
	            	 break;}
                case *:{
	            	System.out.print("enter equation "+x+e+y);
					z=x*y;
					System.out.println("the result is"+z);
	            	 break;}
                case /:{
	             	System.out.print("enter equation "+x+e+y);
				    z=x/y;
					System.out.println("the result is"+z);
	            	break;}

	        	default:
	            	System.out.println("error");}

	}
}
