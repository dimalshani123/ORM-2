package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id

//    private int sId;
//    private String name;
//
//    @OneToOne
//    private Laptop laptop;
//
//    public int getsId() {
//
//        return sId;
//    }
//
//    public void setsId(int sId) {
//        this.sId = sId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public Student(int sId, String name, Laptop laptop) {
//        this.sId = sId;
//        this.name = name;
//        this.laptop = laptop;
//    }
//
//    public Student() {
//    }

    private int sId;
    private String name;

    @OneToOne
    private Laptop laptop;


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Student(int sId, String name, Laptop laptop) {
        this.sId = sId;
        this.name = name;
        this.laptop = laptop;
    }

    public Student() {
    }
}