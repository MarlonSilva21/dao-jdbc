package application;

import model.dao.DepartmentDAO;
import model.dao.FactoryDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDAO departmentDAO = FactoryDAO.createDepartmentDAO();
		
		System.out.println("=== TEST 1: Department Insert ===");
		Department department = new Department(null, "Shoes");
		departmentDAO.insert(department);
		System.out.println("Insert new Department " + department.getName() +" with id = " + department.getId());
		
		System.out.println("=== TEST 2: Department Update ===");
		department = departmentDAO.findById(2);
		department.setName("Eletronics ABC");
		departmentDAO.update(department);
		System.out.println("Update completed");

	}

}
