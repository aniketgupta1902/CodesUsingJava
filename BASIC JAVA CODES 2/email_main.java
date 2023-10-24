
import java.util.Scanner;



public class aniket{

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
Email abc= new Email();
String p;
p = s.nextLine();
abc.set_email(p);
if(abc.check())
System.out.println("Ok!");
else
System.out.println("Invalid email!");

}

}
