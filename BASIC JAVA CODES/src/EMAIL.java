import java.util.Scanner;

public class EMAIL {

	public static void main(String[] args) {
		
 Scanner scn=new Scanner(System.in);
 String str;
 System.out.println("enter your email");
 str= scn.next();
 int count=0;
 for(int i=0;i< str.length(); i++)
 {
  if(str.charAt(i)=='@')
  {
	 System.out.println("@ found");
  count++;
  }
  
 }
 if(count==0)
 { System.out.println("not found");
 }
 
	}

}
