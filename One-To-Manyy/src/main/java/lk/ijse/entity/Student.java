package lk.ijse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

/*inverse end*/

@Entity
public class Student {

    @Id

    private int sId;
    private String name;

    @OneToMany(mappedBy = "student")
    private List<Laptop> laptop;

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

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    public Student(int sId, String name, List<Laptop> laptop) {
        this.sId = sId;
        this.name = name;
        this.laptop = laptop;
    }

    public Student() {
    }
}