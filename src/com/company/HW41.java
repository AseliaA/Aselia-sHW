package com.company;

import java.sql.*;

public class HW41 {


    public java.sql.Connection connect(){
        final String url = "jdbc:postgresql://localhost:5432/";
        final String login = "postgres";
        final String password = "umarlove";
        java.sql.Connection conn = null;
        try{
            conn = DriverManager.getConnection(url , login , password);
            System.out.println("Connected to the PostgreSQl server successfully.");
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public int getAllTrainersAndTheirSalary(){
        String SQL = "SELECT c.full_name , s.salary FROM  coach c join sports_type on c.coach_id = s.sport_type_id";
        int count = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            while(rs.next()){
                System.out.println(rs.getInt(1) + " : "
                        + rs.getString(2));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }


    public int getAllTrainersSalary(String tableName){
        String SQL = "SELECT count (*) FROM " + tableName;
        int count = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            count = rs.getInt(1);
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }
}
