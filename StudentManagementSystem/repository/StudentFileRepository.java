
package repository;

import model.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class StudentFileRepository {

    private final Path filePath =
            Paths.get("data", "students.txt");

    public StudentFileRepository() {
        try {
            Files.createDirectories(filePath.getParent());

            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to create student data file", e);
        }
    }

    public List<Student> loadAll() {
        List<Student> students = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(filePath);

            for (String line : lines) {
                if (line.isBlank()) {
                    continue;
                }

                String[] data = line.split("\\|", -1);

                if (data.length != 5) {
                    throw new IOException(
                            "Invalid student record: " + line);
                }

                students.add(new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3],
                        LocalDate.parse(data[4])
                ));
            }

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(
                    "Unable to load student records", e);
        }

        return students;
    }

    public void saveAll(List<Student> students) {
        List<String> lines = new ArrayList<>();

        for (Student s : students) {
            lines.add(
                    s.getId() + "|" +
                    s.getName() + "|" +
                    s.getAge() + "|" +
                    s.getCourse() + "|" +
                    s.getAdmissionDate()
            );
        }

        try {
            Files.write(filePath, lines);

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to save student records", e);
        }
    }
}
