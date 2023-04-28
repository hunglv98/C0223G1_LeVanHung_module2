package case_study.repository;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    static {
        House house = new House("2", "1", 1, 1, 1, "1", "1", 1);
//        House(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String standardRoom, int numberFloor)
        linkedHashMap.put(house, 1);
//        Villa(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String standardRoom, double poolArea, int numberFloor)
        Villa villa = new Villa("1", "1", 1, 1, 1, "1", "1", 1, 1);
        linkedHashMap.put(villa, 1);
        Room room = new Room("3", "1", 1, 1, 1, "1", "1");
//        Room(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String freeService)
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
    public void add(Facility facility, String id) {
////        if (linkedHashMap.containsKey(facility)) {
////            linkedHashMap.put(facility,linkedHashMap.get(facility)+1);
////        }else linkedHashMap.put(facility,1);
//        boolean flag = false;
//        Set<Facility> keySet = linkedHashMap.keySet();
////        if (facility instanceof Villa) {
//            for (Facility f : keySet) {
//                if (f.getId().equals(id)) {
////                    linkedHashMap.put(facility, linkedHashMap.get(facility) + 1);
////                } else linkedHashMap.put(facility, 1);
////                    System.out.println(true);
////                    System.out.println(f);
//                    flag = true;
//                }
//            }
////        }
//        if(flag){
//            linkedHashMap.put(facility,linkedHashMap.get(facility)+1);
//        }else linkedHashMap.put(facility,1);
//        System.out.println("Thêm thành công");
        Set<Facility> keySet = linkedHashMap.keySet();
        for (Facility f : keySet) {
            if (f.getId().equals(id)) {
                System.out.println(true);

            }
        }
    }


    @Override
    public void showMaintainList() {

    }
}

