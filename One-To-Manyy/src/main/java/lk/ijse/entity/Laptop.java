package lk.ijse.entity;

import jakarta.persistence.*;

/*owners end*/

@Entity
public class Laptop {
    @Id

    private int lId;
    private String brand;

    private String company;

    @ManyToOne
    @JoinColumn(name ="st_id" )
    private Student student;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop(int lId, String brand, String company, Student student) {
        this.lId = lId;
        this.brand = brand;
        this.company = company;
        this.student = student;
    }

    public Laptop() {
    }
}