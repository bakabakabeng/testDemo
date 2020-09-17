package com.yan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yan.entity.Employee;
import com.yan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @RequestMapping("/add")
    public String add(@Valid @RequestBody Employee employee){
        employeeService.add(employee);
        return "success";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        employeeService.deleteById(id);
        return "success";
    }

    @RequestMapping("/update")
    public String update(@Valid @RequestBody Employee employee){
        employeeService.add(employee);
        return "success";
    }

    @RequestMapping("/query/{id}")
    public String queryById(@PathVariable int id) throws JsonProcessingException {
       ObjectMapper mapper = new ObjectMapper();
       List<Employee> employee=employeeService.queryById(id);
       String str=mapper.writeValueAsString(employee);
       return str;
    }




}
