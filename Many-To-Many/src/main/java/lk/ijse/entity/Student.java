package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Student {
    @Id
    private int sId;
    private String name;

    @ManyToMany
    private List<Laptop> laptops;

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

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public Student(int sId, String name, List<Laptop> laptops) {
        this.sId = sId;
        this.name = name;
        this.laptops = laptops;
    }

    public Student() {
    }
}