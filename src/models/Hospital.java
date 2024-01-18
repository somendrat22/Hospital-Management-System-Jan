package models;

import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;
import factory.HospitalObjectFactory;
import service.PatientService;
import service.PatientServiceImpl;

public class Hospital {
    private String name;
    private String address;
    private Long phoneNumber;
    private String emailId;
    private PatientDatabase patientDatabase;
    private DoctorDatabase doctorDatabase;
    private RoomDatabase roomDatabase;

    private PatientService patientService;

    private HospitalObjectFactory hospitalObjectFactory;


    public Hospital(String name, String address, long phoneNumber, String emailId) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void admitPatient(String name, int age, long phoneNumber, String email, String gender, String disease){
        // Patient will provide details
        // Now it is work of hospital to  assign doctor to patient
        // Hospital will assign rooms to patient
        // Hospital will create id for patient
        // When we will get all the details we will create patient object
        // and we will be using our database to save that patient object

        // 1. Generate Id for the patient ->
        int totalPatientCount = HospitalObjectFactory.getPatientDatabase().getTotalPatientCount() + 1;
        String pId = "PID"+totalPatientCount;

        // 2. Get the doctor who is handeling minimum number of patient
        Doctor doctor = HospitalObjectFactory.getDoctorDatabase().getMinimumPatientDoctor();

        // 3. get the room which is not occupied
        Room room = HospitalObjectFactory.getRoomDatabase().getUnoccupiedRoom();
        room.setOccupied(true);

        Patient p = new Patient(pId, name, age, phoneNumber, email, gender, disease, doctor, room, true);
        doctor.patientList.add(p);
        System.out.println("Patient got admitted successfully -> " + p);
    }

    public void createRoom(){
        String roomId = "ROOMID" + (HospitalObjectFactory.getRoomDatabase().getTotalRooms()+1);
        Room room = new Room(roomId, false, null,  null);
        HospitalObjectFactory.getRoomDatabase().addRoomToDB(room);
        System.out.println("Room added successfully -> " +  room);
    }

    public void appointDoctor(String docDegree, String name, long phoneNumber, String speciality, int salary, String timeSlot) throws ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException{
        String docId = "DOCID" + (HospitalObjectFactory.getDoctorDatabase().getTotalDoctors() + 1);
        Doctor doc = new Doctor(docId,docDegree, name, phoneNumber, speciality, salary, timeSlot);
        HospitalObjectFactory.getDoctorDatabase().adddoctorToDB(doc);
        System.out.println("Doctor created successfully ->" + doc);
    }

    public void getPatientById(String pId) throws ArithmeticException{
        PatientService p = new PatientServiceImpl();
        System.out.println(p.getPatientById(pId));
    }



}
