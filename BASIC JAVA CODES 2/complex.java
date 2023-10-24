package best;

import java.util.*;

public class complex {

    private float real;
    private float imag;

complex()
{
real=0;
imag=0;
}
public void setreal(float n)
{
this.real=n;
}
public void setimag(float n)
{
this.imag=n;
}

public float getreal()
{
return real;
}
public float getimag()
{
return imag;
}

public void add(complex c1,complex c2)
{
float x1,x2;
x1=c1.getreal()+c2.getreal();
x2=c1.getimag()+c2.getimag();
System.out.println("sum is:"+x1+" + "+x2+"i");


}
public void sub(complex c1,complex c2)
{
float x1,x2;
x1=c1.getreal()-c2.getreal();
x2=c1.getimag()-c2.getimag();
System.out.println("difference is:"+x1+" + "+x2+"i");
}
public void display()
{System.out.println(this.real +" "+"+"+this.imag +"i:");	
}
public static void main(String []args )
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a1 and b1:");
float a1=sc.nextFloat();
float b1=sc.nextFloat();
System.out.println("enter a2 and b2:");
float a2=sc.nextFloat();
float b2=sc.nextFloat();
   complex c1=new complex();
   complex c2=new complex();
   c1.setreal(a1);
   c1.setimag(b1);
   c2.setreal(a2);
   c2.setimag(b2);
   c1.display();
   c2.display();
   complex c3=new complex();
   c3.add(c1,c2);
   c3.sub(c1,c2);    
}



}


