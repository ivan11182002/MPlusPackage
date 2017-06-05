package xe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import xe.bean.Employee;
import xe.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("EmployeeHome");
	}

	@RequestMapping(value = "/findEmployee", produces = "application/json")
	@ResponseBody
	public List<Employee> findEmployee(Employee employee) {
		System.out.format("getDepartmentId::%s%n", employee.getDepartmentId());
		List<Employee> employeeList = employeeService.findEmployee(employee);
		System.out.format("employeeList::%s%n", employeeList);
		return employeeList;
	}

}
