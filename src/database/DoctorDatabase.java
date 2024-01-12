package database;

import models.Doctor;
import models.Patient;

import java.util.HashMap;
import java.util.List;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDatabase;
    public DoctorDatabase(){
        this.doctorDatabase = new HashMap<>();
    }

    public Doctor getMinimumPatientDoctor(){
        Doctor minDoc = null;
        int min = Integer.MAX_VALUE;
        for(String key : doctorDatabase.keySet()){
            Doctor doc = doctorDatabase.get(key);
            List<Patient> patientList = doc.getPatientList();
            if(patientList.size() < min){
                minDoc = doc;
                min = patientList.size();
            }
        }
        return minDoc;
    }

    public void adddoctorToDB(Doctor doctor){
        String docId = doctor.getDocId();
        doctorDatabase.put(docId, doctor);
    }

    public Doctor getDoctorID(String id){
        return doctorDatabase.get(id);
    }

    public int getTotalDoctors(){
        return doctorDatabase.size();
    }

}
