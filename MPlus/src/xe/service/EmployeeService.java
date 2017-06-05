package xe.service;

import java.util.List;

import xe.bean.Employee;


public interface EmployeeService {

	List<Employee> findEmployee(Employee employee);
    
}
