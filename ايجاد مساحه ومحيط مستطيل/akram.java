import java.util.Scanner;
public class akram {
 public static void main(String[] args){
 double l,w, area, perimeter   ;
 Scanner s=new Scanner(System.in);
     System.out.println("  found the  area  ");
     System.out.println("********************");
     System.out.print("enter w=    ");
     w=s.nextDouble();
     System.out.print("enter l=    ");
     l=s.nextDouble();
     area= w*l ;
     System.out.println("the result area is "+ area  );
     System.out.println("  found the  perimeter  ");
     System.out.println("************************ ");
     perimeter= 2*(l*w) ;
     System.out.println("the result area is "+ perimeter  );
   
 }
}