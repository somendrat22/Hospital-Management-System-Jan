package factory;

import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;

public class HospitalObjectFactory {
    static PatientDatabase patientDatabase = new PatientDatabase();
    static DoctorDatabase doctorDatabase = new DoctorDatabase();
    static RoomDatabase roomDatabase = new RoomDatabase();


    public static PatientDatabase getPatientDatabase() {
        return patientDatabase;
    }

    public static DoctorDatabase getDoctorDatabase() {
        return doctorDatabase;
    }

    public static  RoomDatabase getRoomDatabase() {
        return roomDatabase;
    }
}
