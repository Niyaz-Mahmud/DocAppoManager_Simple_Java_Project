package FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DoctorIO {
  private File doctorFile;
  private FileWriter fileWriter;

  public DoctorIO() {
    doctorFile = new File("F:/Java projects/Doctors appoiment/Doctor.txt");
    if (!doctorFile.exists()) {
      try {
        doctorFile.createNewFile();
      } catch (IOException e) {
        System.err.println("Error creating the doctor file.");
        e.printStackTrace();
      }
    }
  }

  public void writeInFile(String data) {
    try {
      fileWriter = new FileWriter(doctorFile, true);
      fileWriter.write(data + System.lineSeparator());
    } catch (IOException e) {
      System.err.println("Error writing to the doctor file.");
      e.printStackTrace();
    } finally {
      try {
        if (fileWriter != null) {
          fileWriter.close();
        }
      } catch (IOException e) {
        System.err.println("Error closing the doctor file.");
        e.printStackTrace();
      }
    }
  }
}