package com.micro.department.department.departmentserviceimpl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.micro.department.department.entity.Department;
import com.micro.department.department.repository.DepartmentRepo;
import com.micro.department.department.service.DepartmentService;

@Service
public class deparmentserviceimpl  implements DepartmentService {
	@Autowired
	DepartmentRepo obj;

	@Override
	public String Create(Department obj1) {
		obj.save(obj1);
		return "Data added";
	}

	@Override
	public String Update(Department obj1) {
		obj.save(obj1);
		return " Data updated";
	}

	@Override
	public List<Department> Display() {

		return obj.findAll();
	}

	@Override
	public String Delete(int id) {
		obj.deleteById(id);
		return " DatA DELETED";
	}

	@Override
	public List<Department> findByName(String name) {

		return obj.findByName(name);
	}

}
