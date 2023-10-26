package FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PatientIO {
  private File patientFile;
  private FileWriter fileWriter;

  public PatientIO() {
    patientFile = new File("F:/Java projects/Doctors appoiment/Patient.txt");
    if (!patientFile.exists()) {
      try {
        patientFile.createNewFile();
      } catch (IOException e) {
        System.err.println("Error creating the patient file.");
        e.printStackTrace();
      }
    }
  }

  public void writeInFile(String data) {
    try {
      fileWriter = new FileWriter(patientFile, true);
      fileWriter.write(data + System.lineSeparator());
    } catch (IOException e) {
      System.err.println("Error writing to the patient file.");
      e.printStackTrace();
    } finally {
      try {
        if (fileWriter != null) {
          fileWriter.close();
        }
      } catch (IOException e) {
        System.err.println("Error closing the patient file.");
        e.printStackTrace();
      }
    }
  }
}