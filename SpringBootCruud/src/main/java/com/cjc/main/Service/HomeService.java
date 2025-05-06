package com.cjc.main.Service;

import com.cjc.main.model.Student;

public interface HomeService {
	public void SaveData(Student s);
	public Student loginCheck(String un,String ps);
	public Iterable displayAllData();
	public void deleteData(Student s);
	public Student editData(int uid);

}
