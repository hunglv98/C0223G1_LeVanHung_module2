package case_study.repository;

import case_study.model.ContractRent;

import java.util.List;

public interface IContactRepository extends IRepository {
    void add(ContractRent contractRent);

    List<ContractRent> getList();

    int checkId(String id);
}
