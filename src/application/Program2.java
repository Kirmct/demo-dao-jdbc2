package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmenteDao();

        System.out.println("=== Test 1: department findById ====");
        Department department = departmentDao.findById(2);
        System.out.println(department);


        System.out.println("\n=== Test 2: department findAll ====");
        List<Department> list = departmentDao.findAll();
        for (Department obj: list){
            System.out.println(obj);
        }

        System.out.println("\n=== Test 3: department insert ====");
        Department newDepartment = new Department(null, "Perifericos");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! Id: " + newDepartment.getId());

        System.out.println("\n=== Test 4: department update ====");
        department = departmentDao.findById(4);
        department.setName("Eletrodomesticos");
        departmentDao.update(department);
        System.out.println("Update complete!");

        System.out.println("\n=== Test 4: department deleteById ====");
        System.out.print("Enter a id to delete: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete complete!");

        sc.close();

    }
}
