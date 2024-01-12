package models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String docId;
    String docDegree;
    String name;
    Long phoneNumber;
    String speciality;
    int salary;
    String timeSlot;

    List<Patient> patientList;

    public Doctor(String docId, String docDegree, String name, Long phoneNumber, String speciality, int salary, String timeSlot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientList = new ArrayList<>();
    }
}
