package ex9;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        int option=0;

        while (option!=3) {
            System.out.println("1.Add a new student");
            System.out.println("2.List of students");

            System.out.println("3.Quit");
            System.out.print("Choose any option:");
            option = s.nextInt();
            switch (option) {

                case 1:

                    System.out.print("Enter ID:");
                    int id = s.nextInt();
                    System.out.print("Date of birth:");
                    String skip = s.nextLine();
                    String DOB = s.nextLine();
                    System.out.print("Enter name:");
                    String name = s.next();
                    System.out.print("Enter Telephone:+855 ");
                    int telephone = s.nextInt();
                    System.out.print("Enter Country:");
                    String country = s.nextLine();
                    System.out.print("Enter City:");
                    String skip1 = s.nextLine();
                    String city = s.nextLine();
                    System.out.print("Enter group name:");
                    String group = s.nextLine();
                    Student student = new Student(id,DOB, name, telephone, country, city,group);
                    studentManager.addStudent(student);
                    break;
                case 2:
                    studentManager.displayAllStudent();
                    break;

                case 3:
                    System.out.println("Thank for using!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
