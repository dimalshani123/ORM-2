package org.example;


import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.sql.ast.tree.expression.SqlTuple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Student student=session.get(Student.class,1);
        System.out.println(student.getsId());



        transaction.commit();
        session.close();
    }
}