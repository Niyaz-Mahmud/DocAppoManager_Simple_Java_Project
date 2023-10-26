package Interfaces;

import DataClasses.Patient;

public interface IPatientOperations {
  void addPatient(Patient patient);
  void removePatient(Patient patient);
  void showPatientList();
}