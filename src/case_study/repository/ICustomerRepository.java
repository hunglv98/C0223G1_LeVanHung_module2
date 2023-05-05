package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    List<Customer> getList();

    void add(Customer customer);

    int checkId(String id);

    void edit(List<Customer> list);
}
