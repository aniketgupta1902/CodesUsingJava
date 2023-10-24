
package ASD;
import java.util.Scanner;
public class n {

	    public static void main(String args[]) {
	        Scanner scn=new Scanner (System.in);
	       String str= scn.nextLine();
	       System.out.println(str.length());
	       str=str.toUpperCase();
	       System.out.println(str);
	       ispalindrome(str);
	       
	    }

	 public static void ispalindrome(String str)
	 { int i;
	 boolean flag;
	   for (i=0;i<str.length()/2;i++)
	   {
	       if (str.charAt(i)==str.charAt(str.length()-1-i))
	       {
	        continue;
	 }else break;
	   }
	   if (i==(str.length())/2)
	   { flag=true;
	       System.out.println(true);
	   }
	   else{
	    flag=false;
	          System.out.println(false);}
	          
	 }
	}

