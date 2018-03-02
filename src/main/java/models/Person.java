package models;


import java.time.LocalDate;


public class Person {

    private int id;

    private int birthDay;
    private int birthMonth;
    private int birthYear;

    private String firstName;
    private String lastName;
    private String gender;

    private LocalDate birthDate;

    public Person(){

    }


    public Person(int id) {
        this.id = id;
    }

    public Person(int birthDay, int birthMonth, int birthYear) {

        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }

    public Person(int birthDay, int birthMonth, int birthYear, String firstName, String lastName) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int birthDay, int birthMonth, int birthYear, String firstName, String lastName, String gender) {
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }
    public Person(int id, String  firstName, String lastName, String gender, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

