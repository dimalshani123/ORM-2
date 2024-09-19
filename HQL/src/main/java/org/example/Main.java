package org.example;


import org.example.config.FactoryConfiguration;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.sql.ast.tree.expression.SqlTuple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        /*all data from student*/

//      Query query=session.createQuery("from Student");
//      List<Student> students = query.list();
//      for (Student student : students) {
//          System.out.println(student.getsId());
//      }


        /*Unique one data from student*/

//       Query query= session.createQuery("from Student where sId=?1");
//      query.setParameter(1,1);
//      Student student=(Student)query.uniqueResult();
//      System.out.println(student);


       /*load only one column*/
//
//        Query query=session.createQuery("select sId,name from Student where sId=?1");
//        query.setParameter(1,"1");
//        Student student=(Student)query.uniqueResult();
//        System.out.println(student);



        //--------------------------get id,name-------------------------------------------------
//        Query query=session.createQuery("select sId,name from Student ");
//        List<Object[]> list=query.list();
//        for (Object[] person : list) {
//            System.out.println(person[0]);
//            System.out.println(person[1]);
//        }


        //-------------------------------insert--------------------------------
//        Query query = session.createQuery("insert into Student (sId,name) values(?1,?2)");
//        query.setParameter(1,3);
//        query.setParameter(2,"Devid");
//        query.executeUpdate();


        //---------------------------update-----------------------------------
//        Query query1 = session.createQuery("update Student set name=?1 where id = ?2");
//        query1.setParameter(1,"Dew");
//        query1.setParameter(2,1);
//        query1.executeUpdate();

        //--------------------where claus-----------------------------
//        Query query=session.createQuery("from Student  where sId=?1");
//
//        query.setParameter(1,1);
//        Student student= (Student) query.uniqueResult();
//        System.out.println(student.getsId());


        //-------------------------order by---------------------------------
//        Query query6=session.createQuery("from Student s order by s.sId desc");
//        List<Student> perlist=query6.list();
//        for (Student student:perlist) {
//            System.out.println(student.getsId() + "," + student.getName() + ",");
//        }



//-------------------------get two values--------------------------
//        Query query=session.createQuery("select sId,name from Student where sId=1");
//        List<Object[]> list=query.list();
//        for (Object[] arr : list) {
//            int sId = (int) arr[0];
//            String name = (String) arr[1];
//            System.out.println(sId);
//
//        }


        transaction.commit();
        session.close();
    }
}