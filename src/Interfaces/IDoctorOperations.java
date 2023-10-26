package Interfaces;

import DataClasses.Doctor;

public interface IDoctorOperations {
  void addDoctor(Doctor doctor);
  void removeDoctor(Doctor doctor);
  void showDoctorList();
}