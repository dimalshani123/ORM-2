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
        laptop1.setCompany("hp inc");

        Laptop laptop2 = new Laptop();
        laptop2.setlId(2);
        laptop2.setBrand("Apple");
        laptop2.setCompany("Apple inc");

        List<Laptop> laptop = new ArrayList<>();
        laptop.add(laptop1);
        laptop.add(laptop2);

        Student student = new Student();
        student.setsId(1);
        student.setName("Amal");


        laptop1.setStudent(student);
        laptop2.setStudent(student);

        session.save(student);
        session.save(laptop1);
        session.save(laptop2);

        transaction.commit();
        session.close();
    }
}