package com.cjc.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.HomeRepository.HomeRepository;
import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Employee;
@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public void SaveData(Employee e) {
		hr.save(e);
		
	}

	@Override
	public Employee loginCheck(String un, String ps) {
		  
		return hr.findAllByUnameAndPassword(un, ps);
	}

	@Override
	public Iterable displayAllData() {

		return hr.findAll();
	}

	@Override
	public void deleteData(Employee e) {
		hr.delete(e);
		
	}

	@Override
	public Employee editData(int uid) {
		
		return hr.findByUid(uid);
	}

	

}
