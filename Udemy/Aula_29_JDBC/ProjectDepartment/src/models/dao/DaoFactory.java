package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation.DepartmentDaoJDBC;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation.SellerDaoJDBC;

public class DaoFactory {
    // fábrica mias rápida de instanciação. 
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC();
    }
}
