package java8.service.impl;

import java8.classes.Student;
import java8.service.StudentService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class StudentServiceImpl implements StudentService {
    List<Student> students = new ArrayList<>();


    @Override
    public String createStudent(List<Student> students) {
        this.students.addAll(students);


        return "Person created successfully!";
    }

    @Override
    public List<Student> getAll() {
        return students;
    }


    @Override
    public Map<Integer, Student> getAge(List<Student> students) {
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            int years = Period.between(student.getDateOfBirth(), LocalDate.now()) {
                studentMap.put(years, student);
            }
        }
        return studentMap;
    }

    @Override
    public String findByBorrower(String name, List<Student> students, String studentName, List<Student> student) {
        int summa = 0;
        for (Student student1 : students) {
            if (student1.getName().equals(name)) {
                for (Student student2 : students) {
                    if (student2.getName().equals(name)) {
                        boolean a = student2.getBigDecimal().inValue() >= summa;
                        if (a) {
                            BigDecimal subtract = student2.getBigDecimal().subtract(BigDecimal.valueOf(summa));
                            student1.setBigDecimal(subtract);
                            BigDecimal add = student1.getBigDecimal().add(BigDecimal.valueOf(summa));
                            student1.setBigDecimal(add);
                            return "Эртен созсуз бересин!!!";
                        } else return "менде анчалык коп акчам жок!!!";
                    }
                }
            }
            return "Карызга бере албайм!!!";
        }
        return name;
    }

    @Override
    public List<Student> findByName(String name, List<Student> students) {
            List<Student> students1 = new ArrayList<>();
            for (Student student1 : students) {
                if (name.equals(student1.getName())) {
                    students1.add(student1);
                    return students;
                }
            }
            return null;
        }
    }


