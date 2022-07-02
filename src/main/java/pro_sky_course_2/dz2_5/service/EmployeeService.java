package pro_sky_course_2.dz2_5.service;

import org.springframework.stereotype.Service;
import pro_sky_course_2.dz2_5.exception.EmployeeAlreadyAddedException;
import pro_sky_course_2.dz2_5.exception.EmployeeNotFoundException;
import pro_sky_course_2.dz2_5.exception.EmployeeStoragelsFullException;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private static final int limit = 10;
    public static List <Employee> employees = new  ArrayList<>();

    public Employee addEmployee (String firstName, String lastName, String patronymic) {
        Employee employee = new Employee(firstName, lastName, patronymic);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже существует");
        }
        if (employees.size() < limit) {
            employees.add(employee);
            return employee;
        }
        throw new EmployeeStoragelsFullException("Штат сотрудников полный. Кого увольняем?)");
    }

    public Employee deleteEmployee (String firstName, String lastName, String patronymic) {
        Employee employee = new Employee(firstName, lastName, patronymic);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Такого сотрудника нет в организации");
        }
        employees.remove(employee);
        return employee;
    }

    public Employee findEmployee (String firstName, String lastName, String patronymic) {
        Employee employee = new Employee(firstName, lastName, patronymic);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException("Такого сотрудника нет в организации");
        }
        return employee;
    }

}
