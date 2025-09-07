package Udemy.Aula_29_JDBC.ProjectDepartment.src.models.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.DaoFactory;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.SellerDao;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.dao.implementation.SellerDaoJDBC;
import Udemy.Aula_29_JDBC.ProjectDepartment.src.models.utils.Utilities;

public class Seller implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String email;
    private LocalDate birthDate;
    private double baseSalary;
    private Department department;

    public Seller(String name, String email, LocalDate birthDate, double baseSalary) {
        this.id = SellerDaoJDBC.getMaxId();
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
    }

    public Seller(String name, String email, LocalDate birthDate, double baseSalary, Department department) {
        this.id = SellerDaoJDBC.getMaxId();
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        long temp;
        temp = Double.doubleToLongBits(baseSalary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Seller other = (Seller) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        if (Double.doubleToLongBits(baseSalary) != Double.doubleToLongBits(other.baseSalary))
            return false;
        return true;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "[Seller: " + id + "] " +
                "Name: '" + name + "' | " +
                "Email: '" + email + "' | " +
                "BirthDate: " + birthDate.format(formatter) + " | " +
                "BaseSalary: " + String.format("%.2f", baseSalary) + " $ | " +
                "Department: " + department + " |";
    }

    public static void registerSeller() {
        System.out.println("Enter seller data:");

        String nameSeller = Utilities.readLettersAndSpaces("Name");
        String emailSeller = Utilities.readValidEmail();
        LocalDate birthDate = Utilities.readDate();
        double baseSalary = Utilities.readDouble("Base salary");

        Seller seller = new Seller(nameSeller, emailSeller, birthDate, baseSalary);
        SellerDao dataBaseSeller = DaoFactory.createSellerDao();

        int numberDepartment = Utilities.readInt("Department number");
        dataBaseSeller.insert(seller, numberDepartment);
    }

    public static void viewAllDatas() {
        SellerDao dataBaseSeller = DaoFactory.createSellerDao();
        for (Seller seller : dataBaseSeller.findAll()) {
            System.out.println(seller);
        }
    }

    public static void viewDataSeller() {
        int id = Utilities.readInt("Id of seller: ");
        SellerDao dataBaseSeller = DaoFactory.createSellerDao();
        Seller seller = dataBaseSeller.findById(id);

        if (seller != null) {
            System.out.println(seller);
        } else {
            System.out.println("Seller not found");
        }
    }

    public static void updateSeller() {
        System.out.println("Enter the new data for the seller:");

        String name = Utilities.readLettersAndSpaces("Name");
        String email = Utilities.readValidEmail();
        LocalDate birthDate = Utilities.readDate();
        double baseSalary = Utilities.readDouble("Enter base salary");
        int sellerId = Utilities.readInt("Id of seller: ");

        Seller seller = new Seller(name, email, birthDate, baseSalary);
        SellerDao dataBaseSeller = DaoFactory.createSellerDao();
        dataBaseSeller.update(seller, sellerId);
    }

    public static void removeSeller() {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("List of Sellers:");
        Seller.viewAllDatas();
        int idToRemove = Utilities.readInt("Enter the ID of the seller to remove");

        sellerDao.deleteById(idToRemove);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static void findByDepartmentSellers() {
        int id = Utilities.readInt("Enter ID of department");
        Department department = new Department();
        department.setId(id);

        SellerDao dataBaseSeller = DaoFactory.createSellerDao();
        List<Seller> sellers = dataBaseSeller.findByDepartment(department);

        if (!sellers.isEmpty()) {
            department.setName(sellers.get(0).getDepartment().getName());

            for (Seller s : sellers) {
                System.out.println(s);
            }
        } else {
            System.out.println("Sellers not found");
        }

    }
}
