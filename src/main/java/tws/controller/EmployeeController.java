package tws.controller;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tws.mapperRepository.EmployeeMapper;
import tws.moudle.Employee;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
   private EmployeeMapper employeeMapper;
    @PostMapping
    public void insertEmployees(@RequestBody Employee employee){
        employeeMapper.insertEmployees(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeMapper.getAllEmployees();
    }
    @PutMapping
    public void updateEmployees(@RequestBody Employee employee){
        employeeMapper.updateEmployeeById(employee);

    }
    @DeleteMapping(value = "/{id}")
    public void deleteEmployees(@PathVariable("id") int id){
        employeeMapper.deleteEmployeeById(id);
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){
        return  employeeMapper.getEmployeeById(id);
    }

}
