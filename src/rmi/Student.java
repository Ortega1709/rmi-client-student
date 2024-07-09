package rmi;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Student implements Serializable {

    private String matricule;
    private String name;
    private String dateNaissance;
    private String promotion;

    public Student(String matricule, String name, String dateNaissance, String promotion) {
        this.matricule = matricule;
        this.name = name;
        this.dateNaissance = dateNaissance;
        this.promotion = promotion;
    }

    public Student() throws RemoteException {
    }

    public String getMatricule() {
        return matricule;
    }

    public String getName() {
        return name;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matricule='" + matricule + '\'' +
                ", name='" + name + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", promotion='" + promotion + '\'' +
                '}';
    }
}
