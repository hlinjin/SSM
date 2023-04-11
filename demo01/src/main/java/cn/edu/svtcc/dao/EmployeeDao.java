package cn.edu.svtcc.dao;

import cn.edu.svtcc.pojo.Employee;

public interface EmployeeDao {
    public Employee selectEmployeeById(Long id);
    public int addEmployee(Employee employee);
    public int updateEmployee(Employee employee);
    public int deleteEmployee(Long id);
}
