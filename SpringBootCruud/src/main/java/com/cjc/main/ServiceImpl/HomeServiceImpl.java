package com.cjc.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;

@Service
public class HomeServiceImpl implements HomeService{
    @Autowired
	HomeRepository hr;
	@Override
	public void SaveData(Student s) {
		hr.save(s);
		
	}
	@Override
	public Student loginCheck(String un, String ps) {
		return hr.findAllByUnameAndPassword(un, ps);
	}
	@Override
	public Iterable displayAllData() {

		return hr.findAll();
	}
	@Override
	public void deleteData(Student s) {
	  hr.delete(s);
	
	}
	@Override
	public Student editData(int uid) {
	
		return hr.findByUid(uid);
	
	}
	

}
