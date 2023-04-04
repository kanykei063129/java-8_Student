package java8.service;

import java8.classes.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    String createStudent( List<Student> students);

    List<Student> getAll();

    Map<Integer, Student> getAge(List<Student>students);

    String findByBorrower(String name, List<Student>students, String studentName, List<Student> student);

    List<Student> findByName(String name, List<Student> students);






}
