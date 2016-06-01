package servlet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import model.Guitar;

public class Inventory {
	private List<Guitar> guitars;
public Inventory(){
	guitars=search.getdata();
}
public  List<Guitar> getlist(){
	return guitars;
}

public void addGuitar(String number,String builder,String model,String type,String backwood,String topwood,double price, String price1){
Guitar guitar=new Guitar(number,price1,builder,model,type,backwood,topwood);	
	guitars.add(guitar);
}
public Guitar getGuitar(String number){
	for(Iterator<Guitar> i=guitars.iterator();i.hasNext();){
		Guitar guitar=(Guitar)i.next();
		if(guitar.getNumber().equals(number)){
			return guitar;
		}
	}
	return null;
}
public Guitar search(Guitar searchGuitar){
	for(Iterator<Guitar> i=guitars.iterator();i.hasNext();){
		Guitar guitar=(Guitar)i.next();
		String builder=searchGuitar.getBuilder();
		if ((builder!=null)&&(!builder.equals(""))&&(!builder.equals(guitar.getBuilder())))
continue;
		String model=searchGuitar.getModel();
		if((model!=null)&&(!model.equals(""))&&(!model.equals(guitar.getModel())))
			continue;
		String type=searchGuitar.getType();
		if((type!=null)&&(!searchGuitar.equals(""))&&(!type.equals(guitar.getType())))
			continue;
		String backwood=searchGuitar.getBackwood();
		if((backwood!=null)&&(!backwood.equals(""))&&(!backwood.equals(guitar.getBackwood())))
			continue;
		String topwood=searchGuitar.getTopwood();
		if((topwood!=null)&&(!topwood.equals(""))&&(!topwood.equals(guitar.getTopwood())))
			continue;
	}
	return null;
}

}
