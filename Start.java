import DataClasses.*;
import FileIO.*;

import java.util.*;

public class Start {

  public static void main(String args[]) {
    System.out.println("\n--------------------------------------------------------------------------------");
    System.out.println("                         *** DocAppoManager ***");
    System.out.println("\n--------------------------------------------------------------------------------");

    Hospital hospitalObject = new Hospital();
    try (Scanner input = new Scanner(System.in)) {
      DoctorIO doctorIO = new DoctorIO();
      PatientIO patientIO = new PatientIO();
      int choice, subChoice, status = 1;

      Doctor doctor1 = new Doctor("1", "Dr. Akkas Ali", "Male", "ENT", "3pm-8pm", 17, 1200);
      doctor1.addAvailableSlot("3:00 PM");
      doctor1.addAvailableSlot("4:00 PM");
      doctor1.addAvailableSlot("5:00 PM");
      doctor1.addAvailableSlot("6:00 PM");
      doctor1.addAvailableSlot("7:00 PM");

      Doctor doctor2 = new Doctor("2", "Dr. Meherun Proma", "Male", "Physician", "9am-3pm", 45, 1500);
      doctor2.addAvailableSlot("9:00 AM");
      doctor2.addAvailableSlot("10:00 AM");
      doctor2.addAvailableSlot("11:00 AM");
      doctor2.addAvailableSlot("1:00 PM");
      doctor2.addAvailableSlot("2:00 PM");

      Doctor doctor3 = new Doctor("3", "Dr. Hasibul Hasan", "Male", "Surgeon", "8am-2pm", 12, 800);
      doctor3.addAvailableSlot("8:00 AM");
      doctor3.addAvailableSlot("9:00 AM");
      doctor3.addAvailableSlot("10:00 AM");
      doctor3.addAvailableSlot("11:00 AM");
      doctor3.addAvailableSlot("12:00 PM");

      Doctor doctor4 = new Doctor("4", "Dr. Rafik Kuzaman", "Male", "Radiology", "9am-1pm", 29, 900);
      doctor4.addAvailableSlot("9:00 AM");
      doctor4.addAvailableSlot("10:00 AM");
      doctor4.addAvailableSlot("11:00 AM");
      doctor4.addAvailableSlot("12:00 PM");

      hospitalObject.addDoctor(doctor1);
      hospitalObject.addDoctor(doctor2);
      hospitalObject.addDoctor(doctor3);
      hospitalObject.addDoctor(doctor4);

      Patient patient1 = new Patient("1", "Abu Rayhan", "Male", "Allergy", 30, "Dr. Akkas Ali");
      Patient patient2 = new Patient("2", "Siyam Ahmed", "Male", "Cholera", 23, "Dr. Meherun Proma");
      Patient patient3 = new Patient("3", "Asif Khan", "Male", "Diarrhea", 42, "Dr. Rafik Kuzaman");
      Patient patient4 = new Patient("4", "Joy Khan", "Male", "Headache", 42, "Dr. Hasibul Hasan");

      hospitalObject.addPatient(patient1);
      hospitalObject.addPatient(patient2);
      hospitalObject.addPatient(patient3);
      hospitalObject.addPatient(patient4);

      String chosenSlot = "";
      while (status == 1) {
        System.out.println("\n                                    MAIN MENU");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println(" 1. Doctors  2. Patients  ");
        System.out.println("-----------------------------------------------------------------------------------");
        choice = input.nextInt();
        switch (choice) {
        case 1: {
          System.out.println("--------------------------------------------------------------------------------");
          System.out.println("                      **DOCTOR SECTION**");
          System.out.println("--------------------------------------------------------------------------------");
          int subStatus = 1;
          while (subStatus == 1) {
            System.out.println("1. Add New Doctor\n2. Existing Doctors List\n3. Remove Doctor\n4. Back to Main Menu");
            subChoice = input.nextInt();
            switch (subChoice) {
            case 1: {
              try {
                System.out.print("Doctor's ID: ");
                String entryID = input.next();
                System.out.print("Doctor's Name: ");
                input.nextLine();
                String entryName = input.nextLine();
                System.out.print("Doctor's Speciality: ");
                String doctorSpeciality = input.next();
                System.out.print("Doctor's Appointment Time: ");
                String doctorAppointment = input.next();
                System.out.print("Doctor's Gender: ");
                String entryGender = input.next();
                System.out.print("Doctor's Room No: ");
                int doctorRoom = input.nextInt();
                System.out.print("Doctor's Fee is: ");
                int doctorFee = input.nextInt();

                Doctor newDoctor = new Doctor();
                newDoctor.setEntryID(entryID);
                newDoctor.setEntryName(entryName);
                newDoctor.setDoctorSpeciality(doctorSpeciality);
                newDoctor.setDoctorAppointment(doctorAppointment);
                newDoctor.setEntryGender(entryGender);
                newDoctor.setDoctorRoom(doctorRoom);
                newDoctor.setDoctorFee(doctorFee);
                hospitalObject.addDoctor(newDoctor);

                doctorIO.writeInFile("---------Doctor Entry--------------");
                doctorIO.writeInFile("Doctor ID: " + entryID);
                doctorIO.writeInFile("Doctor Name: " + entryName);
                doctorIO.writeInFile("Doctor Speciality: " + doctorSpeciality);
                doctorIO.writeInFile("Doctor Appointment Time: " + doctorAppointment);
                doctorIO.writeInFile("Doctor Gender: " + entryGender);
                doctorIO.writeInFile("Doctor Room No: " + doctorRoom);
                doctorIO.writeInFile("Doctor Fee: " + doctorFee + "\n");
              } catch (Exception e) {
                System.out.println("Invalid input");
              }
              break;
            }
            case 2: {
              System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
              System.out.printf("%-10s | %-20s | %-20s | %-20s | %-8s | %-10s | %-10s%n", "ID", "Name", "Speciality", "Appointment Time", "Gender", "Room No", "Doctor fee");
              System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
              hospitalObject.showDoctorList();
              break;
            }
            case 3: {
              System.out.println("Enter the ID to remove the doctor: ");
              String doctorId = input.next();
              hospitalObject.removeDoctor(hospitalObject.searchDoctor(doctorId));
              break;
            }
            case 4: {
              break;
            }
            }
            System.out.println("\nPress 1 to return and Press 0 to go to the MAIN MENU");
            subStatus = input.nextInt();
          }
          break;
        }
        case 2: {
          System.out.println("--------------------------------------------------------------------------------");
          System.out.println("                     **PATIENT SECTION**");
          System.out.println("--------------------------------------------------------------------------------");
          int subStatus2 = 1;
          while (subStatus2 == 1) {
            System.out.println("1. Add New Patient\n2. Existing Patients List\n3. Remove Patient\n4. Back to Main Menu");
            subChoice = input.nextInt();
            switch (subChoice) {
            case 1: {
              System.out.println("Doctors list");
              System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
              System.out.printf("%-10s | %-20s | %-20s | %-20s | %-8s | %-10s | %-10s%n", "ID", "Name", "Speciality", "Appointment Time", "Gender", "Room No", "Doctor fee");
              System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
              hospitalObject.showDoctorList();
              System.out.println();

              try {
                System.out.print("Patient's ID: ");
                String entryID1 = input.next();
                System.out.print("Patient's Name: ");
                input.nextLine();
                String entryName1 = input.nextLine();
                System.out.print("Patient's Disease: ");
                String patientDisease1 = input.next();
                System.out.print("Patient's Gender: ");
                String entryGender1 = input.next();
                System.out.print("Patient's Age: ");
                int patientAge1 = input.nextInt();

                Patient newPatient = new Patient();
                newPatient.setEntryID(entryID1);
                newPatient.setEntryName(entryName1);
                newPatient.setPatientDisease(patientDisease1);
                newPatient.setEntryGender(entryGender1);
                newPatient.setPatientAge(patientAge1);
                hospitalObject.addPatient(newPatient);

                System.out.print("Please enter your preferred doctor ID: ");
                String doctorId = input.next();
                Doctor chosenDoctor = hospitalObject.searchDoctor(doctorId);

                if (chosenDoctor != null) {
                  System.out.println("You have chosen Doctor " + chosenDoctor.getEntryName());
                  System.out.println("Doctor's Appointment Time: " + chosenDoctor.getAppointment());
                  newPatient.setUnderDoctor(chosenDoctor.getEntryName());

                  System.out.println("Available slots for Doctor " + chosenDoctor.getEntryName() + ":");
                  List < String > availableSlots = chosenDoctor.getAvailableSlots();
                  for (int i = 0; i < availableSlots.size(); i++) {
                    System.out.println((i + 1) + ". " + availableSlots.get(i));
                  }

                  System.out.print("Choose an appointment slot (enter the slot number): ");
                  int slotNumber = input.nextInt();

                  if (slotNumber >= 1 && slotNumber <= availableSlots.size()) {
                    chosenSlot = availableSlots.get(slotNumber - 1);
                    newPatient.setAppointment(chosenSlot);
                    chosenDoctor.removeAvailableSlot(chosenSlot);
                    System.out.println("Appointment scheduled successfully.");
                    System.out.println("You have selected appointment slot: " + chosenSlot);
                  } else {
                    System.out.println("Invalid slot number. Appointment not scheduled.");
                  }
                } else {
                  System.out.println("Invalid doctor ID. Patient not added.");
                }

                patientIO.writeInFile("---------Patient Entry--------------");
                patientIO.writeInFile("Patient ID: " + entryID1);
                patientIO.writeInFile("Patient Name: " + entryName1);
                patientIO.writeInFile("Patient Disease: " + patientDisease1);
                patientIO.writeInFile("Patient Gender: " + entryGender1);
                patientIO.writeInFile("Patient Age: " + patientAge1);
                patientIO.writeInFile("Chosen Doctor for Appointment: " + chosenDoctor.getEntryName());
                patientIO.writeInFile("Selected Appointment Slot: " + chosenSlot);

              } catch (Exception e1) {
                System.out.println("Invalid input");
              }
              break;
            }
            case 2: {
              System.out.println("------------------------------------------------------------------------------------------------------------");
              System.out.printf("%-10s | %-20s | %-15s | %-8s | %-4s | %-20s | %-24s%n", "ID", "Name", "Disease", "Gender", "Age", "Under_Doctor", "Appointment Slot");
              System.out.println("------------------------------------------------------------------------------------------------------------");
              hospitalObject.showPatientList();
              break;
            }
            case 3: {
              System.out.println("Enter the ID to remove the Patient: ");
              String patientId = input.next();
              hospitalObject.removePatient(hospitalObject.searchPatient(patientId));
              break;
            }
            case 4: {
              break;
            }
            }
            System.out.println("\nPress 1 to return and Press 0 to go to the MAIN MENU");
            subStatus2 = input.nextInt();
          }
          break;
        }
        default:
          System.out.println("Error: wrong button pressed");
        }
        System.out.println("\nPress 1 to return to the MAIN MENU or Press 0 to confirm EXIT");
        status = input.nextInt();
      }
    }
  }
}