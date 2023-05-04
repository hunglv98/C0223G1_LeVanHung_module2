package case_study.repository;

import case_study.model.facility.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository extends IRepository {
    void getList();
    void add(Facility facility);
    void showMaintainList();
    boolean checkId(String id);
}
