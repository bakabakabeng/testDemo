package com.yan.serviceImpl;

import com.yan.entity.Employee;
import com.yan.mapper.EmployeeMapper;
import com.yan.service.EmployeeService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public void add(Employee employee) {
        employeeMapper.add(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeMapper.deleteById(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public List<Employee> queryById(int id) {
        return employeeMapper.queryById(id);
    }
}
