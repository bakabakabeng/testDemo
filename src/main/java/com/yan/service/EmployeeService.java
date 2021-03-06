package com.yan.service;

import com.yan.entity.Employee;


import java.util.List;

public interface EmployeeService {
    //添加员工
    public void add(Employee employee);

    //删除员工
    public void deleteById(int id);

    //修改员工
    public void update(Employee employee);

    //查询员工
    public List<Employee> queryById(int id);
}
