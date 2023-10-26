package DataClasses;

public abstract class Entry {
  private String entryID;
  private String entryName;
  private String entryGender;

  public Entry() {}

  public Entry(String entryID, String entryName, String entryGender) {
    this.entryID = entryID;
    this.entryName = entryName;
    this.entryGender = entryGender;
  }

  public void setEntryID(String entryID) {
    this.entryID = entryID;
  }

  public String getEntryID() {
    return entryID;
  }

  public void setEntryName(String entryName) {
    this.entryName = entryName;
  }

  public String getEntryName() {
    return entryName;
  }

  public void setEntryGender(String entryGender) {
    this.entryGender = entryGender;
  }

  public String getEntryGender() {
    return entryGender;
  }

  public abstract void showDetails();
}