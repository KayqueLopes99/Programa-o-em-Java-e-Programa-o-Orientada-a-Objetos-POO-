package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao;

import java.util.List;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Department;


public interface DepartmentDao {
    public void insert(Department departament);

    public void update(Department departament, int id);

    public void deleteById(int id);

    public Department findById(int id);

    public List<Department> findAll();

} 