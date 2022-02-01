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
		System.out.println("Insert new Department with id = " + department.getId());

	}

}
