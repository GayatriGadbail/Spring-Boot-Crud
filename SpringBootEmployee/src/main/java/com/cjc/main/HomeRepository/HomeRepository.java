package com.cjc.main.HomeRepository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.cjc.main.model.Employee;


@Repository

public interface HomeRepository extends CrudRepository<Employee,Integer>
{
	public Employee findAllByUnameAndPassword(String un,String ps);
	public Employee findByUid(int uid);

}
