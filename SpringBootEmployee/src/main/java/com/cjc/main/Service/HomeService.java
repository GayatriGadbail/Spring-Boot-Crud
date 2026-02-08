package com.cjc.main.Service;

import com.cjc.main.HomeRepository.HomeRepository;

import com.cjc.main.model.Employee;


public interface HomeService {
       public void SaveData(Employee e);
       public Employee loginCheck(String un,String ps);
       public Iterable displayAllData();
       public void deleteData(Employee e);
       public Employee editData(int uid); 
}
