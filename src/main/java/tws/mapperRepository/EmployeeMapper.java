package tws.mapperRepository;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import tws.moudle.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Insert("insert into employee values (#{employee.id},#{employee.name},#{employee.age})")
    void insertEmployees(@Param("employee") Employee employee);
    @Select("select * from employee")
    List<Employee> getAllEmployees();
    @Update("update employee set name = #{employee.name}, age = #{employee.age}  where id = #{employee.id} ")
    void updateEmployeeById(@Param("employee") Employee employee);
    @Delete("delete from employee where id = #{id}")
    void deleteEmployeeById(@Param("id") int id);
    @Select("select * from employee where id = #{id}")
    Employee getEmployeeById(@Param("id") int id);
}
