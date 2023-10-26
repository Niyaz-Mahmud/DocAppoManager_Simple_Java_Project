package DataClasses;

public class Patient extends Entry {
  private String patientDisease;
  private int patientAge;
  private String underDoctor;
  private String appointment;

  public Patient() {}

  public Patient(String entryID, String entryName, String entryGender, String patientDisease, int patientAge, String underDoctor) {
    super(entryID, entryName, entryGender);
    this.patientDisease = patientDisease;
    this.patientAge = patientAge;
    this.underDoctor = underDoctor;
  }

  public String getPatientDisease() {
    return patientDisease;
  }

  public void setPatientDisease(String patientDisease) {
    this.patientDisease = patientDisease;
  }

  public int getPatientAge() {
    return patientAge;
  }

  public void setPatientAge(int patientAge) {
    this.patientAge = patientAge;
  }

  public String getUnderDoctor() {
    return underDoctor;
  }

  public void setUnderDoctor(String underDoctor) {
    this.underDoctor = underDoctor;
  }

  public String getAppointment() {
    return appointment;
  }

  public void setAppointment(String appointment) {
    this.appointment = appointment;
  }

  public void showDetails() {
    System.out.printf("%-10s | %-20s | %-15s | %-8s | %-4s | %-20s | %-24s%n", getEntryID(), getEntryName(), getPatientDisease(), getEntryGender(), getPatientAge(), getUnderDoctor(), getAppointment());
}


}