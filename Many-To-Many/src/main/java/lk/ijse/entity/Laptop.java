package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lId;
    private String brand;
    private String company;

    @ManyToMany(mappedBy = "laptops")
    private List<Student> students;

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Laptop(int lId, String brand, String company, List<Student> students) {
        this.lId = lId;
        this.brand = brand;
        this.company = company;
        this.students = students;
    }

    public Laptop() {
    }
}