/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin;
//Database packgaes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anda mxoza
 */

public class register extends loginConfirm{
    keyReg generate;
    String username;
    String password;
    String status;
    Boolean isUpdate;
    public register(String user, String password, String database) throws ClassNotFoundException, SQLException{
        
        super(user,password, database);//parse values to the constructor of the extended class
        
        generate = new keyReg(user,password, database);
    }
    public String[] append(String name, String surname, String gender, String email,
                        int number) throws SQLException{
        
        username = generate.username(name, surname);
        password = generate.password(name, surname, number);
        
        results = execute("select * FROM accInfo where email='"+email+"'");
        
        if(results.next()){
            System.out.println("User with that email already exists !!!");
            status = "!registered";
        }
        else{
           
            execute("insert into accInfo values("+generate.id()+",'"+name+"','"+surname+"','"+gender+"', "
                    +" '"+email+"',"+number+",'"+username+"','"+password+"')");
            status = "registered";
            con.close();
        }
        String[] login = {username, password, status};
        return login;
    }
    
    public Boolean update(String email, String username, String password) throws SQLException{
        
        results = execute("select * FROM accInfo where email='"+email+"'");
        if(results.next()){
            execute("update accInfo set username='"+username+"', password='"+password+"' where email='"+email+"'");
            isUpdate = true;
            con.close();
        }
        else{
            System.out.println("Email does not exist");
            isUpdate = false;
        }
        return isUpdate;
    }
}

