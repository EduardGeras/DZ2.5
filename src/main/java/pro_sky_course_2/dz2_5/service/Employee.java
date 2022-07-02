package pro_sky_course_2.dz2_5.service;

import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String patronymic;

    public Employee(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Employee c2 = (Employee) other;
        return lastName.equals(c2.lastName) && firstName.equals(c2.firstName) && patronymic.equals(c2.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, patronymic);
    }

    @Override
    public String toString() {
        return "Фамилия: " + lastName + ". Имя: " + firstName +". Отчество: " + patronymic;
    }
}
