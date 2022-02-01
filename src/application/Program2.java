package application;

import java.util.List;

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
		
		System.out.println("=== TEST 2: Department findById ===");
		Department dep =  departmentDAO.findById(3);
		System.out.println(dep);
		
		System.out.println("=== TEST 3: Department Update ===");
		dep = departmentDAO.findById(11);
		dep.setName("Lost and Founds");
		departmentDAO.update(dep);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 4: Department delete ===");
		departmentDAO.deleteById(11);
		System.out.println("Delete Completed");
		
		System.out.println("=== TEST 5: Department findAll ===");
		List<Department> listDepartments = departmentDAO.findAll();
		listDepartments.forEach(System.out::println);
		
	}

}
