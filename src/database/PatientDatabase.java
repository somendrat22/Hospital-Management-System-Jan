package database;

import models.Patient;

import java.util.HashMap;

public class PatientDatabase {
    HashMap<String, Patient> patientDB;
    PatientDatabase(){
        this.patientDB = new HashMap<>();
    }

    public void addPatient(Patient obj){
        String pId = obj.getpId();
        patientDB.put(pId, obj);
    }

    public Patient getPatient(String pId){
        return patientDB.get(pId);
    }
}
