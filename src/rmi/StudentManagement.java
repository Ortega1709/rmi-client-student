package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface StudentManagement extends Remote {

    List<Student> getAllStudents() throws RemoteException;
    List<Student> getStudentsByPromotion(String promotion) throws RemoteException;
    void addStudent(String matricule, String name, String date, String promotion) throws RemoteException;
    void updatePromotion(String matricule, String promotion) throws RemoteException;
    void updateDate(String matricule, String date) throws RemoteException;

}
