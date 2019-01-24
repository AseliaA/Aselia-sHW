package com.company;

import java.sql.*;

public class Connecter {

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

    public int getWhereWordA(String tableName){
        String SQL = "SELECT count (*) FROM " + tableName + " where student_name like '%а%' ";
        int count = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){
            rs.next();
            count = rs.getInt("count");
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int getStudentsCount(String tableName){
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


    public int getTrainers(){
        String SQL = "SELECT coach_id , full_name , phone_number FROM coach ";
        int count = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){

            while(rs.next()){
                System.out.println(rs.getInt(1) + " : "
                        + rs.getString(2) +
                        " Phone_name: " + rs.getString(3));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public int getGroups(){
        String SQL = "SELECT language_id , language_name FROM course  ";
        int count = 0;

        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL)){

            while(rs.next()){
                System.out.println(rs.getInt("language_id") + " : "
                        + rs.getString("language_name"));
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return count;
    }

}
