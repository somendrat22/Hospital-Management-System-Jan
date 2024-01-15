package models;

public class Patient {
    public String pId;
    String name;
    int age;
    Long phoneNumber;

    boolean isAdmit;

    public String getpId() {
        return pId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

    String email;
    String gender;
    String disease;

    Doctor doctor;

    Room room;

    public Patient(String pId, String name, int age, Long phoneNumber, String email, String gender, String disease, Doctor doctor, Room room, boolean isAdmit) {
        this.pId = pId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.disease = disease;
        this.doctor = doctor;
        this.room = room;
        this.isAdmit = isAdmit;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pId='" + pId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", isAdmit=" + isAdmit +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", disease='" + disease + '\'' +
                ", doctor=" + doctor +
                ", room=" + room +
                '}';
    }
}
