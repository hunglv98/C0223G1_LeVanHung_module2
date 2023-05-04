package case_study.repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.util.LinkedHashMap;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    static {
        House house = new House("SVHO-1234", "House", 1, 1, 1, "Normal", "Normal", 1);
        linkedHashMap.put(house, 4);
        Villa villa = new Villa("SVVL-1234", "Villa", 1, 1, 1, "Normal", "Normal", 1, 1);
        linkedHashMap.put(villa, 1);
        Room room = new Room("SVRO-1234", "Room", 1, 1, 1, "Normal", "Buffet");
        linkedHashMap.put(room, 1);
    }

    @Override
    public void getList() {
        Set<Facility> keySet = linkedHashMap.keySet();
        for (Facility key : keySet) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }

    @Override
    public void add(Facility facility) {
        linkedHashMap.put(facility, 1);
    }


    @Override
    public void showMaintainList() {
        for (Facility f : linkedHashMap.keySet()) {
            if (linkedHashMap.get(f) == 5) {
                System.out.println(f);
            }
        }
    }

    @Override
    public boolean checkId(String id) {
        Set<Facility> keySet = linkedHashMap.keySet();
        for (Facility f : keySet) {
            if (f.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void updateBooking(String str){
        Set<Facility> keySet = linkedHashMap.keySet();
        for (Facility f: keySet) {
            if(f.getId().equals(str)){
                linkedHashMap.put(f,linkedHashMap.get(f)+1);
                break;
            }
        }
    }
}

