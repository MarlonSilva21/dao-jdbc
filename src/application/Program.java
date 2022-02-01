package application;

import java.util.Date;
import java.util.List;

import model.dao.FactoryDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDAO = FactoryDAO.createSellerDAO();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDAO.findById(4);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDAO.findByDepartment(department);
		list.stream().forEach(System.out::println);
		
		System.out.println("=== TEST 3: seller findAll ===");
		list = sellerDAO.findAll();
		list.stream().forEach(System.out::println);
		
		System.out.println("=== TEST 4: Seller insert ===");
		Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDAO.insert(seller2);
		System.out.println("Inserted! New Id = " + seller2.getId());
		
		System.out.println("=== TEST 5: Seller update ===");
		seller = sellerDAO.findById(1);
		seller.setName("Bob Brow Wayne");
		sellerDAO.update(seller);
		System.out.println("Update Completed");
	}
}
