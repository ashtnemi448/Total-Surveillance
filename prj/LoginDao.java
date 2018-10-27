package bean;  
import java.sql.*;  
public class LoginDao {  
  
public static boolean validate(LoginBean beanobj){  
boolean status=false;  
try{  
	System.out.println("zavnya");
Connection con=ConnectionProvider.getCon();  
System.out.println("zavnya");              
PreparedStatement ps=con.prepareStatement("select * from login where email=? and pass=?");  
  System.out.println("zavnya");
  System.out.println(beanobj.getEmail());
  System.out.println(beanobj.getPass());
ps.setString(1,beanobj.getEmail());  
System.out.println("zavnya");
ps.setString(2, beanobj.getPass());  
System.out.println("zavnya");
ResultSet rs=ps.executeQuery();
System.out.println("zavnya6");  
status=rs.next();  
System.out.println(status);
System.out.println("zavnya7");
System.out.println("ResultSet: " + rs);
}catch(Exception e){ e.printStackTrace();}  
  
return status;  
  
}  
} 