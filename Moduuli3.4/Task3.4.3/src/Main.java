import java.io.*;

public class Main {

    private final static String FILENAME = "enrolments.ser"; // File to store enrolment objects. This is in the project root folder (Tasks).

    public static void main(String[] args) {

        // CREATE STUDENTS, COURSES AND ENROLMENTS:
        Student student1 = new Student(111, "Rasmus", 23);
        Student student2 = new Student(122, "Ilona", 19);
        Student student3 = new Student(133, "Anna", 25);
        Student student4 = new Student(144, "Valtteri", 20);

        Course course1 = new Course("ABC-1234", "Math basics", "T.Korhonen");
        Course course2 = new Course("DEF-5678", "Communications", "A.Aalto");
        Course course3 = new Course("GHI-9012", "English", "C.Smith");

        Enrolment en1 = new Enrolment(student1, course1, "20.08.2024");
        Enrolment en2 = new Enrolment(student2, course1, "22.08.2024");
        Enrolment en3 = new Enrolment(student3, course2, "02.09.2025");
        Enrolment en4 = new Enrolment(student4, course3, "14.01.2023");


        File f = new File(FILENAME);

        if (f.exists() && f.isFile()) {
            try (
                    FileOutputStream outputstream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputstream);
            ) {
                objects.writeObject(en1); // Write all enrolment objects to the file (serialize)
                objects.writeObject(en2);
                objects.writeObject(en3);
                objects.writeObject(en4);
            } catch (Exception e) {
                System.err.println(e);
            }

            try {
                FileInputStream inputstream = new FileInputStream(FILENAME);
                ObjectInputStream objects = new ObjectInputStream(inputstream);

                // Read all enrolment objects from the file (deserialize) and print their info:
                Enrolment en = (Enrolment) objects.readObject();
                System.out.println("\n----------------------------\nENROLMENT INFO: \n----------------------------\nDate: "
                        + en.getEnrolmentDate() + en.getCourse() + en.getStudent());

                en = (Enrolment) objects.readObject();
                System.out.println("\n----------------------------\nENROLMENT INFO: \n----------------------------\nDate: "
                        + en.getEnrolmentDate() + en.getCourse() + en.getStudent());

                en = (Enrolment) objects.readObject();
                System.out.println("\n----------------------------\nENROLMENT INFO: \n----------------------------\nDate: "
                        + en.getEnrolmentDate() + en.getCourse() + en.getStudent());
                en = (Enrolment) objects.readObject();
                System.out.println("\n----------------------------\nENROLMENT INFO: \n----------------------------\nDate: "
                        + en.getEnrolmentDate() + en.getCourse() + en.getStudent());

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
}
