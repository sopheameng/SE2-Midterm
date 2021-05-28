package ex9;
import java.util.*;
public class StudentManager {

    List<Student> students = new ArrayList<Student>();
    Scanner s = new Scanner(System.in);
    public List<Student> listAllStudent() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void displayAllStudent() {
        for (Student student : listAllStudent()) {
            System.out.print(student.getId() + "\t\t");
            System.out.print(student.getDOB()+"\t");
            System.out.print("+855 "+student.getTelephone()+"\t");
            System.out.print(student.getName()+"\t");
            System.out.println(student.getCountry()+"\t");
            System.out.print(student.getCity()+"\t");
            System.out.print(student.getGroup()+"\t");
        }
    }

}
