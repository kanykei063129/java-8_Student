package java8.classes;

import java8.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

public class Student {
    private String name;
    private LocalDate dateOfBirth;

    private Gender gender;
    private BigDecimal bigDecimal;

    public Student(String name, LocalDate dateOfBirth, Gender gender, BigDecimal bigDecimal) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bigDecimal = bigDecimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", bigDecimal=" + bigDecimal +
                '}';
    }
}

