package DataClasses;
import Interfaces.*;
import java.util.ArrayList;
import java.util.List;

public class Hospital implements IDoctorOperations, IPatientOperations {

  private String name;
  private List < Doctor > doctors = new ArrayList < > ();
  private List < Patient > patients = new ArrayList < > ();

  public Hospital() {
    // Default Constructor
  }

  public Hospital(String name) {
    this.name = name;
  }

  public List < Doctor > getDoctors() {
    return doctors;
  }
  public void addAllDoctors(List < Doctor > doctorList) {
    doctors.addAll(doctorList);
  }
  public void addAllPatients(List < Patient > patientList) {
    patients.addAll(patientList);
  }

  public void addDoctor(Doctor doctor) {
    doctors.add(doctor);
  }

  public void removeDoctor(Doctor doctor) {
    doctors.remove(doctor);
    System.out.println("Doctor Removed");
  }

  public void showDoctorList() {
    for (Doctor doctor: doctors) {
      doctor.showDetails();
    }
  }

  public void addPatient(Patient patient) {
    patients.add(patient);
  }

  public List < Patient > getPatients() {
    return patients;
  }

  public void removePatient(Patient patient) {
    Patient removedPatient = searchPatient(patient.getEntryID());
    if (removedPatient != null) {
      patients.remove(removedPatient);
      System.out.println("Patient Removed");
    } else {
      System.out.println("Patient Not Found");
    }
  }

  public void showPatientList() {
    for (Patient patient: patients) {
      patient.showDetails();
    }
  }

  public Doctor searchDoctor(String id) {
    for (Doctor doctor: doctors) {
      if (doctor.getEntryID().equals(id)) {
        return doctor;
      }
    }
    System.out.println("Doctor Not Found");
    return null;
  }

  public Patient searchPatient(String id) {
    for (Patient patient: patients) {
      if (patient.getEntryID().equals(id)) {
        return patient;
      }
    }
    System.out.println("Patient Not Found");
    return null;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}