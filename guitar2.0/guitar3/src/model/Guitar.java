package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.corba.se.pept.transport.Connection;

public class Guitar {
	

private  String number,builder,model,type,backwood,topwood,price;

public Guitar(){
	
}

public Guitar(String number,String builder,String model,String type,String backwood,String topwood, String price){
	
	this.number=number;
	this.price=price;
	this.builder=builder;
	this.model=model;
	this.type=type;
	this.backwood=backwood;

this.topwood=topwood;
	
}



public String getNumber(){
	return number;
}
//public double getPrice{
	//return price;
//}
public void setPrice(String newPrice){
	this.price=newPrice;
}
public String getModel(){
	return model;
}
public String getType(){
	return type;
}
public String getBackwood(){
	return backwood;
}
public String getTopwood(){
	return topwood;
}
public String getBuilder(){
	return builder;
}



}
