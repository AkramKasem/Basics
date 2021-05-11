import java.util.Scanner;
public class akram
{
	public static void main(String[] args)
	{
		int grate ;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the student grate=  ");
		grate=s.nextInt();
		if ((grate>90)&&(grate=100));
			System.out.println("the student is excallent");
		if ((grate>85)&&(grate<90));
			System.out.println("the student is very good");
		if ((grate>75)&&(grate<85));
			System.out.println("the student is good");
		if ((grate>65)&&(grate<75));
			System.out.println("the student is poor");
		if ((grate>50)&&(grate<65));
			System.out.println("the student is bad");
		if (grate<50);
			System.out.println("the student is fail");



	}
}
