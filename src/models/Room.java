package models;


public class Room {
    String roomId;
    boolean isOccupied;
    Patient patient;
    Doctor doctor;

    public Room(String roomId, boolean isOccupied, Patient patient, Doctor doctor) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.patient = patient;
        this.doctor = doctor;
    }
}
