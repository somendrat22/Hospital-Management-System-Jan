package service;

import database.PatientDatabase;
import factory.HospitalObjectFactory;
import models.Doctor;
import models.Patient;
import models.Room;

public class PatientServiceImpl implements PatientService{


    PatientDatabase patientDatabase;
    public PatientServiceImpl(){
        this.patientDatabase = HospitalObjectFactory.getPatientDatabase();
    }

    @Override
    public Patient getPatientById(String pId) {
        return patientDatabase.getPatient(pId);
    }

    @Override
    public Doctor getPatientDoctorDetails(String pId) {
        return patientDatabase.getPatient(pId).getDoctor();
    }

    @Override
    public Room getPatientBedDetails(String pId) {
        return patientDatabase.getPatient(pId).getRoom();
    }
}
