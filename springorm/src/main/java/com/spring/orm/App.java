package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.StudentEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
       StudentEntity student = new StudentEntity();
//       int r = studentDao.insert(student);
//       System.out.println("Record inserted with ID "+r);
//       System.out.println("Records before deleting....");
//       List<StudentEntity> list = studentDao.getAllStudents();
//       System.out.println("\n"+list);
////       studentDao.deleteStudent(124);
//       System.out.println("Records After Deleting....");
//       List<StudentEntity> list2 = studentDao.getAllStudents();
//       System.out.println("\n"+list2);
       
       System.out.println("Welcome");
       Scanner sc = new Scanner(System.in);
       
       boolean go = true;
       while(true) {
    	   System.out.println("Press 1 for Add new Student");
    	   System.out.println("Press 2 fro Display All Students");
    	   System.out.println("Press 3 fro Display details of single student");
    	   System.out.println("Press 4 for Delete Student");
    	   System.out.println("Press 5 for Update Student");
    	   System.out.println("Press 6 fro exit");
    	   
    	   try {
    		   int choice = sc.nextInt();
    		   if (choice==1) {
				System.out.println("Enter ID");
				int id = sc.nextInt();
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter City");
				String city = sc.next();
				StudentEntity newStudent = new StudentEntity(id,name,city);
				int sId = studentDao.insert(newStudent);
				System.out.println("Record inserted Successfully \n ...ID "+sId);
			}
    		   else if(choice==2) {
    			   System.out.println("Your Choice is "+choice);
    			   List<StudentEntity> list = studentDao.getAllStudents();
    		       System.out.println("\n"+list);
    		   }else if(choice==3) {
    			   System.out.println("Enter Id of Student ");
    			   int id = sc.nextInt();
    			   studentDao.deleteStudent(id);
    			   System.out.println("Record Deleted Successfully....");
    		   }else if(choice==4) {
    			   
    		   }else if(choice==5) {
    			   
    		   }else if(choice==6) {
    			   go=false;
    			   break;
    		   }
    		   
		} catch (Exception e) {
			System.out.println("Invalid Input");
			System.out.println(e.getMessage());
		}
       }
       
    }
}
