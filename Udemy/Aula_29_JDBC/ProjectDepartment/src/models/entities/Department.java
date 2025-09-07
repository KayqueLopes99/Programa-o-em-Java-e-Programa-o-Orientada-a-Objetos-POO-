package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities;

import java.io.Serializable;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.DaoFactory;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.DepartmentDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation.DepartmentDaoJDBC;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.utils.Utilities;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    public Department(String name) {
        this.id = DepartmentDaoJDBC.getMaxId();
        this.name = name;
    }
    public Department() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Department other = (Department) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[Department: " + id + "] " +
                "Name: '" + name + "'";
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void viewAllDepartments() {
        DepartmentDao dataBaseDepartment = DaoFactory.createDepartmentDao();
        System.out.println("----------------- DEPARTMENTS LIST----------------------");
        System.out.println("--------------------------------------------------------");
        for (Department department : dataBaseDepartment.findAll()) {
            System.out.println(department);
        }
        System.out.println("--------------------------------------------------------");
    }

    public static void viewDepartmentById() {
        int id = Utilities.readInt("Enter department ID: ");
        DepartmentDao dao = DaoFactory.createDepartmentDao();
        Department department = dao.findById(id);
        if (department != null) {
            System.out.println(department);
        }
    }

    public static void registerDepartment() {
        System.out.println("Enter departament data:");
        String nameDepartment = Utilities.readLettersAndSpaces("Name");
        Department department = new Department(nameDepartment);
        DepartmentDao dataBaseDepartment = DaoFactory.createDepartmentDao();
        dataBaseDepartment.insert(department);
        System.out.println("Department registered!");
    }

    public static void updateDepartment() {
        int id = Utilities.readInt("Enter ID of department to update: ");
        String name = Utilities.readLettersAndSpaces("Enter new department name");
        Department dep = new Department(name);
        DepartmentDao dataBaseDepartment = DaoFactory.createDepartmentDao();
        dataBaseDepartment.update(dep, id);
    }

    public static void removeDepartment() {
        viewAllDepartments();
        int id = Utilities.readInt("Enter ID of department to remove: ");
        DepartmentDao dataBaseDepartment = DaoFactory.createDepartmentDao();
        dataBaseDepartment.deleteById(id);
    }

}
