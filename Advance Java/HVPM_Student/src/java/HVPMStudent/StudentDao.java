/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HVPMStudent;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class StudentDao {
Connection connection;
    public StudentDao() throws ClassNotFoundException, SQLException {
       
        try{
        
             Class.forName("com.mysql.cj.jdbc.Driver");
                 out.println("driver loaded");
               connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mySQL_database", "root", "#aqi5r1");
                out.println("connection Establish");
        }
        catch(Exception ex){
            out.println(ex);
        }
      }
        
    public int InsertMethode(Student student) {
        int r=0;
        try{
            PreparedStatement preparedStatment = connection.prepareStatement("insert into HVPM_Student value(?,?,?,?)");
        preparedStatment.setString(1, student.getRollNO());
        preparedStatment.setString(2,student.getName());
        preparedStatment.setString(3,student.getAddress());
        preparedStatment.setString(4,student.getCity());
        r=preparedStatment.executeUpdate();
        }
        catch(Exception e){
        out.print(e);
        }
    return r;
    }
    
   }
    
    

