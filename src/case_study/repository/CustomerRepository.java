package case_study.repository;

import case_study.model.person.Customer;
import case_study.utils.ReadWriteCustomer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final List<Customer> list = ReadWriteCustomer.read();
    @Override
    public List<Customer> getList() {
        return list;
    }

    @Override
    public void add(Customer customer) {
        list.add(customer);
        ReadWriteCustomer.write(list);
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
    public void edit(List<Customer> list) {
        ReadWriteCustomer.write(list);
    }
}
