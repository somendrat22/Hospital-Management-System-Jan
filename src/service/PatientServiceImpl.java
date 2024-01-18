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
    public Patient getPatientById(String pId) throws ArithmeticException {
        Patient p  = patientDatabase.getPatient(pId);
//        String name  = p.getName();
        // DB Connection

        try{
            throw  new ArithmeticException("");
        }catch (NullPointerException e){
            System.out.println("Patient with this particular id is not present i ssystem");
        }finally {
            // Disconnect the db connection

            System.out.println("In finally");
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
