package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.aplication;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.DaoFactory;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.DepartmentDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.SellerDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Department;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception{
        Department department = new Department("jogos");
        DepartmentDao dataBaseDepartment = DaoFactory.createDepartmentDao();
        dataBaseDepartment.insert(department);


        Department department2 = new Department("games");
        dataBaseDepartment.update(department2, 2);


        Seller seller = new Seller("kayque", "kayque@gmail.com", new java.text.SimpleDateFormat("dd/MM/yyyy").parse("22/12/2004"), 1500.50);
        SellerDao dataBaseSeller = DaoFactory.createSellerDao();
        dataBaseSeller.insert(seller, 2);

        Seller seller1 = new Seller("daniel", "daniel@gmail.com", new java.text.SimpleDateFormat("dd/MM/yyyy").parse("22/12/2004"), 1500.50);
        dataBaseSeller.update(seller1, 3);





        for (Seller s : dataBaseSeller.findAll()) {
            System.out.println(s);
            
        }

        for (Department d : dataBaseDepartment.findAll()) {
            System.out.println(d);
            
        }

        dataBaseDepartment.deleteById(3);
        dataBaseSeller.deleteById(1);

       System.out.println(dataBaseSeller.findById(1));
       System.out.println(dataBaseDepartment.findById(1));


    }

}
