package client;

import rmi.Student;
import rmi.StudentManagement;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class RMIClient {

    public static void main(String[] args) {
        try {
            String url = "rmi://localhost:5099/Student";
            StudentManagement studentManagement = (StudentManagement) Naming.lookup(url);

            // Add students
            studentManagement.addStudent("Matricule 1", "Name 1", "08/09/2002", "Promotion 1");
            studentManagement.addStudent("Matricule 2", "Name 2", "08/05/2000", "Promotion 1");
            studentManagement.addStudent("Matricule 3", "Name 3", "28/04/1999", "Promotion 2");
            studentManagement.addStudent("Matricule 4", "Name 4", "25/01/1997", "Promotion 2");

            // get all students
            System.out.println("All students");
            List<Student> students = studentManagement.getAllStudents();
            students.forEach(student -> System.out.println(student.toString()));

            // update student promotion
            System.out.println("Update student");
            studentManagement.updatePromotion("Matricule 1", "Promotion 2");

            System.out.println("All students");
            students = studentManagement.getAllStudents();
            students.forEach(student -> System.out.println(student.toString()));

            System.out.println("All students by promotion");
            students = studentManagement.getStudentsByPromotion("Promotion 1");
            students.forEach(student -> System.out.println(student.toString()));

            System.out.println("Change date");
            studentManagement.updateDate("Matricule 1", "07/08/2002");

            System.out.println("All students");
            students = studentManagement.getAllStudents();
            students.forEach(student -> System.out.println(student.toString()));



        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            System.out.println("Error while trying to access the server remotely " + e);
        }
    }

}
