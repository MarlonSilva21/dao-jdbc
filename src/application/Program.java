package application;

import model.dao.FactoryDAO;
import model.dao.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDAO = FactoryDAO.createSellerDAO();
		
		Seller seller = sellerDAO.findById(4);
		
		System.out.println(seller);
		
	}

}
