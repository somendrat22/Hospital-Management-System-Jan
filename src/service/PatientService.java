package service;

import models.Doctor;
import models.Patient;
import models.Room;

public interface PatientService {

    public Patient getPatientById(String pId);

    public Room getPatientBedDetails(String pId);

    public Doctor getPatientDoctorDetails(String pId);
}
