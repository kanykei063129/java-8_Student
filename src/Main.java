import java8.classes.Student;
import java8.enums.Gender;
import java8.service.StudentService;
import java8.service.impl.StudentServiceImpl;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        try {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("Kanykei", LocalDate.of(2006,03,19), Gender.FAMELE,25000);
        Student student = new Student("Adil",LocalDate.of(2004,02,17),Gender.MALE,12000);
        Student student3 = new Student("Erlan",LocalDate.of(2001,9,11),Gender.MALE,5000);
        Student student4 = new Student("Aigerim",LocalDate.of(2005,07,5),Gender.FAMELE,250);
        List<Student>students = new ArrayList<>(List.of(student1,student,student3,student4));
        studentService.createStudent(students);
        while (true){
            System.out.println("""
                    1.санын бассаныз адамдарды тузосуз!
                    2.бардык адамдарды аласыз!
                    3.санын жазсан бардык студенттердин жашын табуучу метод иштейт!
                    4.санын бассан карыз алуучу метод иштейт
                    5.санын бассаныз аты менен табуучу метод иштейт""");
            System.out.println("san beriniz:");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println(studentService.getAll());
                    break;
                case 2:
                    String word = scanner.nextLine();
                    System.out.print("Адамдарды тузуу:");
                    System.out.println(studentService.getAll());
                    break;
                case 3:
                    String word1 = scanner.nextLine();
                    System.out.print("Адамдарды алуу:");
                    String word2 = scanner.nextLine();
                    System.out.println(studentService.findByName(word2, students));
                    break;
                case 4:
                    int number1 = scanner.nextInt();
                    System.out.print("Жашын табуу:");
                    System.out.println(studentService.getAge( students));
                    break;
                case 5:
                    String word5 = scanner.nextLine();
                    System.out.print("Карыз алуучу:");
                    String name1 = scanner.nextLine();
                    while (true) {

                        System.out.print("CAR NAME : ");
                        String carName1 = scanner.nextLine();
                        System.out.println(studentService.findByBorrower(name1, students, student.getName(), students));
                        if ((personService.payCars(name1, people, carName1, cars) == ("You don't have enough money!!!"))) {
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("YOU ENTERED A WRONG COMBINATION!!!");
                    break;
            }
        }

    } catch (
    InputMismatchException e) {

        System.err.println("you entered a number instead of letters!!!");
    }
}
        }

    }
}