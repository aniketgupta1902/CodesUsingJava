package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args)  {

            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost/db4?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
                System.out.print("Database is connected !");

                Statement statement = conn.createStatement();
                statement.execute("Select * from invoice");
                ResultSet results = statement.getResultSet();
                while(results.next()){
                    System.out.println("\n"+results.getInt("INV_NUM") + "\t\t" +
                            results.getString("PROD_NUM") + "\t\t" +
                            results.getInt("UNIT_SOLD") + "\t\t" +
                                    results.getInt("CUST_NUM") + "\t\t" +
                                    results.getDate("INV_DATE") + "\t\t" +
                                    results.getInt("INV_AMOUNT") + "\t\t" +
                                    results.getInt("VENDOR_ID")
                            );
                }

                results.close();

                statement.close();
                conn.close();
            }
            catch(Exception e)
            {
                System.out.print("Do not connect to DB - Error:"+e);
            }
    }
}
