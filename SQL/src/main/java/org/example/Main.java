package org.example;


import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.sql.ast.tree.expression.SqlTuple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

//       NativeQuery query=session.createNativeQuery("select * from student");
//       query.addEntity(Student.class);
//       List<Student>studentList=query.list();
//       for (Student student:studentList){
//           System.out.println(student);
//       }

        //-------------------------------insert--------------------------------
//        NativeQuery  query = session.createNativeQuery("insert into Student (id,name) values(?1,?2)");
//        query.setParameter(1,6);
//        query.setParameter(3,"Devid");
//        query.executeUpdate();

        //---------------------------update-----------------------------------
//        NativeQuery query1 = session.createNativeQuery("update Student set name=?1 where sId = ?2");
//        query1.setParameter(1,"Anju");
//        query1.setParameter(2,4);
//        query1.executeUpdate();


        //---------------------------delete----------------------------------
//        NativeQuery query1 = session.createNativeQuery("delete from Person where sId=:id");
//        query1.setParameter("id",2);
//        query1.executeUpdate();


        //-------------------------order by---------------------------------
//        NativeQuery query6=session.createNativeQuery("from Student s order by s.sId desc");
//        List<Student> perlist=query6.list();
//        for (Student student:perlist){
//            System.out.println(student.getsId()+","+student.getName()+",");
//        }





        transaction.commit();
        session.close();
    }
}