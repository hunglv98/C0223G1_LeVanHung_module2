package case_study.service;

import case_study.model.facility.Facility;

public interface IFacilityService extends IService{
    void showList();
    void showMaintainList();
    void add(Facility facility,String id);
}
