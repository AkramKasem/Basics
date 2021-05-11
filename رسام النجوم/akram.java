import java.util.*;

public class akram {

	public static void main(String[] args)
	{
	System.out.println("welcome to calculater!");

        Scanner s = new Scanner(System.in);
        int k;
	System.out.print("Enter x: ");
        k= s.nextInt();
	while (k<=8)
	{int l=1;
        while (l<=(8-k)){
                System.out.print(" ");
            l+=1;}
        int m=1;
        while (m<=k){
            System.out.print("*");
           m+=1;}
            System.out.println(" ");
            k+=1;
        }
	}
}



