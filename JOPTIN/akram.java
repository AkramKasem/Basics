import java.util.*;
import javax.swing.JOptionPane;
public class akram {
   public static void main(String[]args){
  Scanner s=new Scanner (System.in);
  int d,m,y;
  System.out.println("******************** ****        ");
  System.out.println("**   Enter date   **************         ");
  System.out.println("******************** ****         ");
  d=Integer.parseInt(JOptionPane.showInputDialog("Enter day"));
  m=Integer.parseInt(JOptionPane.showInputDialog("Enter month"));
  y=Integer.parseInt(JOptionPane.showInputDialog("Enter year"));
   do
   {if (((d<=31)&&(d>=1))&&((m<=12)&&(m>=1)))
     {switch(m){
 	    case 4:
  	    case 6:
	    case 9:
	    case 11:
	           if (d==30){
	    	       d=1;
				   m=m+1;}
		       else
		           d=d+1;
		       break;
        case 1:
	    case 3:
        case 5:
	    case 7:
	    case 8:
	    case 10:
	           if (d==31){
	    		   d=1;
				   m=m+1;}
			   else
			       d=d+1;
			   break;
        case 12:
	           if (d==31){
		 	       d=1;
			       m=1;
			       y=y+1;}
			   else
			       d=d+1;
	   	       break;
	    case 2:
	           boolean leap=((y%400==0)||((y%4==0)&&(y%100!=0)));
	             if (leap)
	                 if(d==29){
		   			     d=1;
					     m=3;}
				     else
				         d=d+1;
			     else
			  	     if (d==28){
					      d=1;
					      m=3;}
				     else
				          d=d+1;
			    break;	      }
	    JOptionPane.showMessageDialog("tomorrow is :"+d+"-"+m+"-"+y);}
 else
       JOptionPane.showMessageDialog("error enter the true date again");
        int x = JOptionPane.showConfirmDialog("Do You Want To Continue?");}
	        while (if (x == JOptionPane.YES_OPTION))

	        else if (x== JOptionPane.NO_OPTION)
	            JOptionPane.showMessageDialog("User Pressed no");
	        else if(x== JOptionPane.CANCEL_OPTION)
         JOptionPane.showMessageDialog("you are welcome");

  }
}