package Task3;
import java.io.*;
public class Main {
    public static void main(String[] args){
        Student student = new Student (1,"Jack", 25);
        Student student2 = new Student (2, "John", 38);


        Course course = new Course("CS101", "Java", " Matti");
        Course course2 = new Course ("CS123", "OOP", "Jarkko");

        Enrollment enroll = new Enrollment(student, course, "2025-8-18");
        Enrollment enroll2 = new Enrollment (student2, course2, "2025-10-10");


        // Serialize objects to enrollments.ser
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enrollments.ser"))) {
            //first set
            oos.writeObject(student);
            oos.writeObject(course);
            oos.writeObject(enroll);

            //second set
            oos.writeObject(student2);
            oos.writeObject(course2);
            oos.writeObject(enroll2);

            System.out.println("Serialization successful! Data saved to enrollments.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize objects from enrollments.ser
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enrollments.ser"))) {
            // first set
            Student s = (Student) ois.readObject();
            Course c = (Course) ois.readObject();
            Enrollment e = (Enrollment) ois.readObject();

            //second set
            Student s2= (Student) ois.readObject();
            Course c2 = (Course) ois.readObject();
            Enrollment e2 = (Enrollment) ois.readObject();

            System.out.println("\nDeserialized Data1 :");
            System.out.println(s);
            System.out.println(c);
            System.out.println(e);

            System.out.println("\nDeserialized Data2:");
            System.out.println(s2);
            System.out.println(c2);
            System.out.println(e2);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
