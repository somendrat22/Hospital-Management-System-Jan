package database;

import models.Doctor;

import java.util.HashMap;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDatabase;
    DoctorDatabase(){
        this.doctorDatabase = new HashMap<>();
    }
}
