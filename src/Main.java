import models.Hospital;

public class Main {
    public static void main(String[] args) {

        Hospital h = new Hospital("XYZ", "XYZ", 123, "XYZ");
        h.appointDoctor("MBBS", "Somendra", 123, "HeartSurgeon", 100000, "12:30-3:30");
        h.createRoom();
        h.admitPatient("Somendra", 23, 123,"123,", "Male", "Kuch nahi" );
    }
}