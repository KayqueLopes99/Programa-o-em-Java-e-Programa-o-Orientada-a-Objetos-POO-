package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao;

import java.util.List;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities.Seller;

public interface SellerDao {
    public void insert(Seller seller, int departmentId);

    public void update(Seller seller, int id);

    public void deleteById(int id);

    public Seller findById(int id);

    public List<Seller> findAll();
}
