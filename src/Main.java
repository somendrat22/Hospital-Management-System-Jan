import models.Hospital;

import java.nio.file.FileAlreadyExistsException;

public class Main {

    public static void hii() throws ArithmeticException{
        int sonAge = 5;
        int motherAge = 2;
        if(motherAge < sonAge){
            Hospital h = new Hospital("XYZ", "XYZ", 123, "XYZ");
            h.getPatientById("123");
        }else{

        }
    }

    public static void h1() throws FileAlreadyExistsException{
        throw new FileAlreadyExistsException("Hey");
    }


    public static void h2() throws FileAlreadyExistsException{
        h1();
    }



    public static void main(String[] args) throws ArithmeticException{

        Hospital h = new Hospital("XYZ", "XYZ", 123, "XYZ");
        h.appointDoctor("MBBS", "Somendra", 123, "HeartSurgeon", 100000, "12:30-3:30");
        h.createRoom();
        h.admitPatient("Somendra", 23, 123,"123,", "Male", "Kuch nahi" );
        h.getPatientById("PIDr2yrorwbfcs");
    }
}