package servlet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.corba.se.pept.transport.Connection;

import DAO.DbUtil;
import model.Guitar;

public class search {
	   public static void main(String  [] args)
	   {
		   Inventory inv=new Inventory();
		   System.out.println(inv.getlist());
	        Guitar guitars = new Guitar();
	        guitars.getBackwood();//这样就可以调用
	      //  inv.search(guitars);
	   }
	 public static List<Guitar>   getdata(){
			Connection conn=(Connection) DbUtil.getConnection();
			PreparedStatement stmt;
			List<Guitar> guitars = null;
			try {
				stmt = ((java.sql.Connection) conn).prepareStatement("select * from guitar");
				ResultSet rs= stmt.executeQuery();
				//遍历查询
				guitars=new ArrayList();
				while(rs.next()){
					Guitar guitar=new Guitar(rs.getString("number"),rs.getString("builder"),rs.getString("model"),rs.getString("type"),rs.getString("backwood"),rs.getString("topwood"),rs.getString("price"));
					guitars.add(guitar);
					}
				return guitars;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return guitars;
	   }
}
