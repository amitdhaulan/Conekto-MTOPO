package registered_user_r_w;

import java.io.FileWriter;
import java.io.IOException;

import modules_automation.Register;

public class WritingRegisteredUsers {
	// Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	// CSV file header
	private static final String FILE_HEADER = "UserName,Password";

	/* creating CSV file for the registered users */
	public static void writeCsvFile(String fileName) {

		GettingRegisteredUsers getUsers = new GettingRegisteredUsers(Register.users.getEmail(), Register.users.getPassword());

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileName, true);

			// Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a new student object list to the CSV file
			fileWriter.append(getUsers.getEmail());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(getUsers.getPassword());
			fileWriter.append(NEW_LINE_SEPARATOR);

			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}
}
