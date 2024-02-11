

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
public class Conn {
    Statement s;
    Connection c;
    public Conn(){
        try {


            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","ganesh@123");
            s = c.createStatement();

        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new Conn();
    }


    }


    //jdbc:mysql://localhost:3306/?user=root