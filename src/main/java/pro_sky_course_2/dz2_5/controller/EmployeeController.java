package pro_sky_course_2.dz2_5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro_sky_course_2.dz2_5.service.Employee;
import pro_sky_course_2.dz2_5.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("lastName") String lastName,
                                @RequestParam("firstName") String firstName,
                                @RequestParam("patronymic") String patronymic) {
        return employeeService.addEmployee(lastName, firstName, patronymic);
    }
    @GetMapping("/delete")
    public Employee deleteEmployee(@RequestParam("lastName") String lastName,
                                   @RequestParam("firstName") String firstName,
                                   @RequestParam("patronymic") String patronymic) {
        return employeeService.deleteEmployee(lastName, firstName, patronymic);
    }
    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("lastName") String lastName,
                                 @RequestParam("firstName") String firstName,
                                 @RequestParam("patronymic") String patronymic) {
        return employeeService.findEmployee(lastName, firstName, patronymic);
    }
}
