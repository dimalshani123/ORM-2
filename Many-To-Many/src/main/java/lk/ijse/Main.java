package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Laptop laptop1 = new Laptop();
        laptop1.setlId(1);
        laptop1.setBrand("Hp");
        laptop1.setCompany("hp lnc");

        Laptop laptop2 = new Laptop();
        laptop2.setlId(2);
        laptop2.setBrand("Dell");
        laptop2.setCompany("Dell lnc");

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);

        Student student1 = new Student();
        student1.setsId(1);
        student1.setName("Amal");

        Student student2 = new Student();
        student2.setsId(2);
        student2.setName("Shan");

        List<Student>students=new ArrayList<>();
        students.add(student1);
        students.add(student2);

        laptop1.setStudents(students);
        laptop2.setStudents(students);

        student1.setLaptops(laptops);
        student2.setLaptops(laptops);



        session.save(laptop1);
        session.save(laptop2);
        session.save(student1);
        session.save(student2);






        transaction.commit();;
        session.close();

    }
}