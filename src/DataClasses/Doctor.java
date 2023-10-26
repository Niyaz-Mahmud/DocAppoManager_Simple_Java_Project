package DataClasses;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Entry {
  private String speciality;
  private String appointment;
  private int room;
  private int fee;

  public Doctor() {}

  private List < String > availableSlots;

  public Doctor(String entryID, String entryName, String entryGender, String speciality, String appointment, int room, int fee) {
    super(entryID, entryName, entryGender);
    this.speciality = speciality;
    this.appointment = appointment;
    this.room = room;
    this.fee = fee;
    this.availableSlots = new ArrayList < > ();
  }

  public List < String > getAvailableSlots() {
    return availableSlots;
  }

  public void addAvailableSlot(String slot) {
    availableSlots.add(slot);
  }

  public void removeAvailableSlot(String slot) {
    availableSlots.remove(slot);
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setDoctorSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public String getAppointment() {
    return appointment;
  }

  public void setDoctorAppointment(String appointment) {
    this.appointment = appointment;
  }

  public int getRoom() {
    return room;
  }

  public void setDoctorRoom(int room) {
    this.room = room;
  }

  public int getFee() {
    return fee;
  }

  public void setDoctorFee(int fee) {
    this.fee = fee;
  }

  public void showDetails() {
    System.out.printf("%-10s | %-20s | %-20s | %-20s | %-8s | %-10s | %-10s%n", getEntryID(), getEntryName(), getSpeciality(), getAppointment(), getEntryGender(), getRoom(), getFee());
  }
}