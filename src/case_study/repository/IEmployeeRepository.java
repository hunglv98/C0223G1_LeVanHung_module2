package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository {
    List<Employee> getList();
    void add(Employee employee);
    int checkId(String id);
    void edit(List<Employee> list);
}
