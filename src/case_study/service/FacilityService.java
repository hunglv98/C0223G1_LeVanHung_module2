package case_study.service;

import case_study.model.facility.Facility;
import case_study.repository.FacilityRepository;

import java.util.LinkedHashMap;

public class FacilityService implements IFacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void showList() {
        facilityRepository.getList();
    }

    @Override
    public void showMaintainList() {
        facilityRepository.showMaintainList();
    }

    @Override
    public void add(Facility facility,String id) {
        facilityRepository.add(facility,id);
    }
}
