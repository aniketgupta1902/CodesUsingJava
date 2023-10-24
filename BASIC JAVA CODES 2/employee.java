
package abc;
import java.util.*; 
public class employee {
 int emp_id;
 String emp_name;
 Date joining_date;

 employee()
 { 
 }
 employee(int id)
 {
	 emp_id=id;
 }
 employee(int id,String name)
 {emp_id=id;
  emp_name =name;
  joining_date= new Date(2001,0,10);
} employee(String name)
 {
 emp_name =name;
} employee(int id,Date date)
 {emp_id=id;
 joining_date=date;
} employee(String name,Date date)
 {joining_date=date   ;
 emp_name ="name";
}
void display()
{System.out.println("employee id is"+ emp_id);
System.out.println("name is"+ emp_name);
System.out.println("date is"+ joining_date);
}
}