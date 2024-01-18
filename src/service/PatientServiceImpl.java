package service;

import database.PatientDatabase;
import exceptions.DatabaseNotInitializedException;
import exceptions.IDDoesNotExistException;
import factory.HospitalObjectFactory;
import models.Doctor;
import models.Patient;
import models.Room;

public class PatientServiceImpl implements PatientService{


    PatientDatabase patientDatabase;
    public PatientServiceImpl() throws DatabaseNotInitializedException{
        this.patientDatabase = null;
        if(this.patientDatabase == null){
            throw new DatabaseNotInitializedException("Can't Create Database");
        }
    }

    @Override
    public Patient getPatientById(String pId){
        Patient p  = patientDatabase.getPatient(pId);
        if(p == null){
           throw new IDDoesNotExistException(String.format("Patient with Id %s does not exist in System.", pId));
        }
        return p;
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
