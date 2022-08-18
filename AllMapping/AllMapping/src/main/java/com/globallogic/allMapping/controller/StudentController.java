package com.globallogic.allMapping.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.allMapping.entity.AddressEntity;
import com.globallogic.allMapping.entity.RegisterEntity;
import com.globallogic.allMapping.entity.StudentEntity;
import com.globallogic.allMapping.entity.TeacherEntity;
import com.globallogic.allMapping.repo.AddressRepo;
import com.globallogic.allMapping.repo.RegisterRepo;
import com.globallogic.allMapping.repo.StudentRepo;
import com.globallogic.allMapping.repo.TeacherRepo;


@RestController
@RequestMapping("/map")
public class StudentController {
	
	@Autowired
	StudentRepo srepo;
	
	@Autowired
	AddressRepo arepo;

	@Autowired
	TeacherRepo trepo;

	@Autowired
    RegisterRepo rrepo;
	
	@GetMapping("/")
	public List<StudentEntity> showstudent()
	{
		return srepo.findAll();
	}

	@GetMapping("/reg/{id}")
	public List<StudentEntity> searchregshowstudent(@PathVariable("id") long id)
	{
		List<StudentEntity> stu = srepo.findAll();
		System.out.println(stu);
		
		List<StudentEntity> sid = stu.stream().filter(e -> (e.getRegister().getId())==id).collect(Collectors.toList());
		
	
		
		return sid;
	}
	@GetMapping("/sear/{id}")
	public StudentEntity searchshowstudent(@PathVariable("id") long id)
	{
	
		
		return srepo.findById(id).get();
	}
	
	
	@PostMapping("/two")
	public List<StudentEntity> SecondsaveStudent(@RequestBody StudentEntity  ad)
	{
		RegisterEntity reg=rrepo.findById(ad.getRegister().getId()).get();
		List<AddressEntity> addr=new ArrayList<>();
		List<AddressEntity> res=ad.getAddress();
		for(AddressEntity e:res) {
			AddressEntity ads=arepo.findById(e.getId()).get();
		addr.add(ads);
		}
		
		List<TeacherEntity> tr=new ArrayList<>();
		List<TeacherEntity> tres=ad.getTeacher();
		for(TeacherEntity e:tres) {
			TeacherEntity trs=trepo.findById(e.getId()).get();
		tr.add(trs);
		}
		System.out.println("Data Added Successfully");
		ad.setRegister(reg);
		ad.setAddress(addr);
		ad.setTeacher(tr);
		
		srepo.save(ad);
		
		
		
		return srepo.findAll();
	}
	@PostMapping("/")
	public StudentEntity saveStudent(@RequestBody StudentEntity  ad)
	{
		System.err.println(ad);
		srepo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @PutMapping("/")
    public StudentEntity updateStudent(@RequestBody StudentEntity  ad)
	{
		System.err.println(ad);
		srepo.save(ad);
		System.err.println(ad);
		return ad;
	}
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") long id)
	{
    	System.err.println("deleted id is : "+id);
		srepo.deleteById(id);
		return "Record Has been deleted!";
	}
    

}
