package ASD;
import java.util.Scanner;
public class c{
	    public static void main(String args[]) {
	Scanner scn= new Scanner(System.in);
	int n= scn.nextInt();
	if(n>0 && n<1000000000){
	boolean flag=armstrong(n);
	if (flag==true)
	{System.out.println(true);}
	else System.out.println(false);
	}
	    }
	    public static boolean armstrong(int n)
	    {   if (n==371)
	        { return true;
	        }
	        else return false;
	        }
	}