package case_study.repository;

import case_study.utils.ReadWriteEmployee;
import case_study.model.person.Employee;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final List<Employee> list = ReadWriteEmployee.read();

    @Override
    public List<Employee> getList() {
        return list;
    }

    @Override
    public void add(Employee employee) {
        list.add(employee);
        ReadWriteEmployee.write(list);
    }

    @Override
    public int checkId(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(List<Employee> list) {
        ReadWriteEmployee.write(list);
    }
}

