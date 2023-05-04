package case_study.service;

import case_study.model.facility.Facility;

public interface IFacilityService extends IService{
    void showList();
    void showMaintainList();
    void addHouse();
    void addVilla();
    void addRoom();

}
