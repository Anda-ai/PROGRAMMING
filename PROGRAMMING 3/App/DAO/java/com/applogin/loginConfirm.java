/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.applogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anda mxoza
 */
public class loginConfirm {
    Connection con;
    Statement stmnt;
    String user;
    String password;
    String database;
    String fqur1;
    String host = "jdbc:mysql://localhost:3306";
    //pointers............
    ResultSet results;
    String result;
    boolean isResultSet = false;
    boolean isLogging;
    public loginConfirm(String user, String password, String database) throws ClassNotFoundException, SQLException{
        this.user = user;
        this.password = password;
        this.database = database;
        fqur1 =  host+"/"+database;
        dbLogin();
    }
    public Boolean isLogin(String username, String password) throws SQLException{
        results = execute("select * from accInfo where username='"+username+"' and password='"+password+"'");
        if(results.next()){
            isLogging = true;
        }
        else{
            isLogging = false;
        }
        return isLogging;
    }
            
    public void dbLogin() throws ClassNotFoundException, SQLException{//login to SQL
        Class.forName("com.mysql.cj.jdbc.Driver");//throws ClassNotFoundException
        con = DriverManager.getConnection(fqur1,user,password);
        stmnt= con.createStatement();
    }
    public ResultSet execute(String sql)throws SQLException{
        //******EXECUTEQUERY********************//use only to retrieve data
        //*results = stmnt.executeQuery(sql);
        //**************************************
        
        //******EXECUTEUPDATE********************//use only to modify or alter data
        //stmnt.executeUpdate(sql);
        //**************************************
        
        //******EXECUTE*************************//execute anycommand
        isResultSet = stmnt.execute(sql);
        if(isResultSet){
            results = stmnt.getResultSet();
        }
        //**************************************
       return results;
    }
}
