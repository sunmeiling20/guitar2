package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
	//绾剛绱惍锟�?
	//static String url="jdbc:sqlserver://localhost:1433; DatabaseName=test";
	static String url="jdbc:mariadb://localhost:3306/test";
	static String userName="root";
	static String password="123456";
	static Connection conn=null;
	public static Connection getConnection(){
		
		try{
			//绾剛绱惍锟�?
			Class.forName("org.mariadb.jdbc.Driver");	
			conn=DriverManager.getConnection(url,userName,password);
		}catch(ClassNotFoundException e){
			
		}		//瀵よ櫣鐝涢崚鐗堟殶閹诡喖绨遍惃鍕箾閹猴拷
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

}
