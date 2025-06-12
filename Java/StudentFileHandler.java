import java.io.*;

class StudentFileHandler {
    public static void main(String[] args) throws IOException {
        String fileName = "students.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) 
        {
            String[] studentNames = {"John", "Emma", "Sophia", "Michael"};
            for (String name : studentNames) 
            {
                writer.write(name);
                writer.newLine(); 
            }
            System.out.println("Student names written to file successfully.");
        } 
            catch (IOException e) 
        {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
        {
            System.out.println("\nStudent Names in Uppercase:");
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line.toUpperCase());
            }
        }
          catch (IOException e) 
        {
            System.out.println("Error reading from file: " + e.getMessage());
        }   
    }
}
