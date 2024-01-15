package models;


public class Room {
    String roomId;
    boolean isOccupied;
    Patient patient;

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", isOccupied=" + isOccupied +
                ", patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }

    Doctor doctor;

    public Room(String roomId, boolean isOccupied, Patient patient, Doctor doctor) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
