package servlet;

import model.Guitar;

public class FingGuitarTester {
	public static void main(String[] args){
		Inventory inventory=new Inventory();
		initializeInventory(inventory);
		Guitar whatErinlikes=new Guitar("","0","fender","Stratocastor","a","b","c");
		Guitar guitar=inventory.search(whatErinlikes);
		if(guitar != null){
			System.out.println("���ҵ��ļ����ͺ���"+guitar.getNumber());
		}
		else{
			System.out.println("�Ҳ������༪����");
		}
}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		
	}

}
