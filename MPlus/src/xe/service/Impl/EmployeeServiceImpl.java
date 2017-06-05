package xe.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import xe.bean.Employee;
import xe.dao.example.EmployeeExample;
import xe.dao.example.EmployeeExample.Criteria;
import xe.dao.mapper.EmployeeMapper;
import xe.service.EmployeeService;

@Service
@Transactional(noRollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	public List<Employee> findEmployee(Employee employee) {
		EmployeeExample example = new EmployeeExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isEmpty(employee.getFirstName())==false) {
			criteria.andFirstNameLike("%"+employee.getFirstName()+"%");
		}
		if (employee.getDepartmentId()!=null) {
			criteria.andDepartmentIdEqualTo(employee.getDepartmentId());
		}
		
		List<Employee> employeeList = employeeMapper.selectByExample(example);
		return employeeList;
	}

}
