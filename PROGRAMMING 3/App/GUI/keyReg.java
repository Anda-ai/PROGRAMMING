/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin;

import java.sql.SQLException;

/**
 *
 * @author anda mxoza
 */
public class keyReg extends loginConfirm{
    
    int id;
    String username;
    String passsword;
    
    public keyReg(String user, String password, String database) throws ClassNotFoundException, SQLException{
         super(user,password, database);//parse values to the constructor of the extended class
    }
    
    public int id() throws SQLException{
        results = execute("select * FROM accInfo ORDER BY id DESC LIMIT 1");
        if(results.next()){
            id = results.getInt("id");
            id++;
        }
        else{
            id=1;
        }
        return id;
    }
    public String username(String name, String surname){
        username = name+"."+surname;
        return username;
    }
    public String password(String name, String surname, int number){
        password = surname.substring(surname.length()-4).toLowerCase();//get last 4 characters of surname and to lower case
        password = password.substring(0,1).toUpperCase() + password.substring(password.length()-3).toLowerCase();//get first character to uppercase
        password = password + name.substring(1, 3).toLowerCase();//add first and second character of name and to lowercase
        password = password+"@"+ String.valueOf(number).substring(String.valueOf(number).length()-4);
        return password;
    }
}
