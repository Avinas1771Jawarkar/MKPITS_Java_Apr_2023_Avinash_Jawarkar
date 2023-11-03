package com.example.student_webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentService {
    Connection connection;
    public StudentService() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost://3306/mysql_database", "root", "#aqi5r1");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }



    }
public int insertRecord(Student student) throws SQLException {
        int result=0;
    PreparedStatement preparedStatement= connection.prepareStatement("insert into Student_Data values (?,?,?,?)");
    preparedStatement.setString(1,student.getRollno());
    preparedStatement.setString(2,student.getName());
    preparedStatement.setString(3,student.getAddress());
    preparedStatement.setString(4,student.getCity());
    result= preparedStatement.executeUpdate();

return result;
}

}
