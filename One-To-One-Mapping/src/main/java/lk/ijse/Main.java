package lk.ijse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Laptop;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

//        Laptop laptop=new Laptop();
//        laptop.setlId(1);
//        laptop.setBrand("hp");
//        laptop.setCompany("HP lnc");
//
//        Student student=new Student();
//        student.setsId(1);
//        student.setName("Anjana");
//        student.setLaptop(laptop);



        Student student=new Student();
        Laptop laptop=new Laptop();
       laptop.setlId(1);
        laptop.setBrand("hp");
       laptop.setCompany("HP lnc");
       laptop.setStudent(student);


        student.setsId(1);
        student.setName("Anjana");
        student.setLaptop(laptop);



        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        session.save(laptop);
        session.save(student);

        transaction.commit();;
        session.close();
    }
}