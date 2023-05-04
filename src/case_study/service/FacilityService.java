package case_study.service;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.FacilityRepository;
import case_study.validate.ValidateFacility;

import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private FacilityRepository facilityRepository = new FacilityRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showList() {
        facilityRepository.getList();
    }

    @Override
    public void showMaintainList() {
        facilityRepository.showMaintainList();
    }

    @Override
    public void addHouse() {
        System.out.println("Cho nhập id");
        String id1;
        do {
            id1 = sc.nextLine();
            if (!ValidateFacility.validateHouse(id1)) {
                System.out.println("Nhập theo định dạng SVHO-XXXX với X là số");
            } else if (facilityRepository.checkId(id1)) {
                System.out.println("ID này đã tồn tại");
            }
        } while (facilityRepository.checkId(id1) || !ValidateFacility.validateHouse(id1));
        System.out.println("Nhập tên");
        String name1;
        do {
            name1 = sc.nextLine();
            if (!ValidateFacility.validateName(name1)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateName(name1));
        System.out.println("Nhập diện tích sử dụng");
        double usedArea1;
        do {
            usedArea1 = Double.parseDouble(sc.nextLine());
            if (!ValidateFacility.validateUsedArea(usedArea1)) {
                System.out.println("Nhập diện tích lớn hơn 30 m2");
            }
        } while (!ValidateFacility.validateUsedArea(usedArea1));
        System.out.println("Số tiền thuê");
        double rentCost1;
        do {
            rentCost1 = Double.parseDouble(sc.nextLine());
            if (!ValidateFacility.validateRentCost(rentCost1)) {
                System.out.println("Chi phí thuê phải lớn hơn 0");
            }
        } while (!ValidateFacility.validateRentCost(rentCost1));
        System.out.println("Nhập số người");
        int numberPeople1;
        do {
            numberPeople1 = Integer.parseInt(sc.nextLine());
            if (!ValidateFacility.validatePeople(numberPeople1)) {
                System.out.println("Số người phải lớn hơn 0 và nhỏ hơn 20");
            }
        } while (!ValidateFacility.validatePeople(numberPeople1));
        System.out.println("Nhâp loại thuê");
        String typeOfRent1;
        do {
            typeOfRent1 = sc.nextLine();
            if (!ValidateFacility.validateTypeOfRent(typeOfRent1)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateTypeOfRent(typeOfRent1));
        System.out.println("Nhập tiêu chuẩn phòng");
        String standardRoom;
        do {
            standardRoom = sc.nextLine();
            if (!ValidateFacility.validateStandard(standardRoom)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateStandard(standardRoom));
        System.out.println("Nhập số tầng");
        int numberFloor1;
        do {
            numberFloor1 = Integer.parseInt(sc.nextLine());
            if (!ValidateFacility.validateFloor(numberFloor1)) {
                System.out.println("Số tầng phải là nguyên dương");
            }
        } while (!ValidateFacility.validateFloor(numberFloor1));
        House house = new House(id1, name1, usedArea1, rentCost1, numberPeople1, typeOfRent1, standardRoom, numberFloor1);
        facilityRepository.add(house);
    }

    @Override
    public void addVilla() {
        System.out.println("Cho nhập id");
        String id;
        do {
            id = sc.nextLine();
            if (!ValidateFacility.validateVilla(id)) {
                System.out.println("Nhập theo định dạng SVVL-XXXX với X là số");
            } else if (facilityRepository.checkId(id)) {
                System.out.println("ID này đã tồn tại");
            }
        } while (facilityRepository.checkId(id) || !ValidateFacility.validateVilla(id));
        System.out.println("Nhập tên");
        String name;
        do {
            name = sc.nextLine();
            if (!ValidateFacility.validateName(name)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateName(name));
        System.out.println("Nhập diện tích sử dụng");
        double usedArea1;
        do {
            usedArea1 = Double.parseDouble(sc.nextLine());
            if (!ValidateFacility.validateUsedArea(usedArea1)) {
                System.out.println("Nhập diện tích lớn hơn 30 m2");
            }
        } while (!ValidateFacility.validateUsedArea(usedArea1));
        System.out.println("Số tiền thuê");
        double rentCost1;
        do {
            rentCost1 = Double.parseDouble(sc.nextLine());
            if (!ValidateFacility.validateRentCost(rentCost1)) {
                System.out.println("Chi phí thuê phải lớn hơn 0");
            }
        } while (!ValidateFacility.validateRentCost(rentCost1));
        System.out.println("Nhập số người");
        int numberPeople1;
        do {
            numberPeople1 = Integer.parseInt(sc.nextLine());
            if (!ValidateFacility.validatePeople(numberPeople1)) {
                System.out.println("Số người phải lớn hơn 0 và nhỏ hơn 20");
            }
        } while (!ValidateFacility.validatePeople(numberPeople1));
        System.out.println("Nhâp loại thuê");
        String typeOfRent1;
        do {
            typeOfRent1 = sc.nextLine();
            if (!ValidateFacility.validateTypeOfRent(typeOfRent1)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateTypeOfRent(typeOfRent1));
        System.out.println("Nhập tiêu chuẩn phòng");
        String standardRoom;
        do {
            standardRoom = sc.nextLine();
            if (!ValidateFacility.validateStandard(standardRoom)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateStandard(standardRoom));
        System.out.println("Nhập diện tích hồ bơi");
        double poolArea = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tầng");
        int numberFloor;
        do {
            numberFloor = Integer.parseInt(sc.nextLine());
            if (!ValidateFacility.validateFloor(numberFloor)) {
                System.out.println("Số tầng phải là số nguyên dương");
            }
        } while (!ValidateFacility.validateFloor(numberFloor));
        Villa villa = new Villa(id, name, usedArea1, rentCost1, numberPeople1, typeOfRent1, standardRoom, poolArea, numberFloor);
        facilityRepository.add(villa);
    }

    @Override
    public void addRoom() {
        System.out.println("Cho nhập id");
        String id;
        do {
            id = sc.nextLine();
            if (!ValidateFacility.validateRoom(id)) {
                System.out.println("Nhập theo định dạng SVRO-XXXX với X là số");
            } else if (facilityRepository.checkId(id)) {
                System.out.println("ID này đã tồn tại");
            }
        } while (facilityRepository.checkId(id) || !ValidateFacility.validateRoom(id));
        System.out.println("Nhập tên");
        String name;
        do {
            name = sc.nextLine();
            if (!ValidateFacility.validateName(name)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateName(name));
        System.out.println("Nhập diện tích sử dụng");
        double usedArea1;
        do {
            usedArea1 = Double.parseDouble(sc.nextLine());
            if (!ValidateFacility.validateUsedArea(usedArea1)) {
                System.out.println("Nhập diện tích lớn hơn 30 m2");
            }
        } while (!ValidateFacility.validateUsedArea(usedArea1));
        System.out.println("Số tiền thuê");
        double rentCost1;
        do {
            rentCost1 = Double.parseDouble(sc.nextLine());
            if (!ValidateFacility.validateRentCost(rentCost1)) {
                System.out.println("Chi phí thuê phải lớn hơn 0");
            }
        } while (!ValidateFacility.validateRentCost(rentCost1));
        System.out.println("Nhập số người");
        int numberPeople1;
        do {
            numberPeople1 = Integer.parseInt(sc.nextLine());
            if (!ValidateFacility.validatePeople(numberPeople1)) {
                System.out.println("Số người phải lớn hơn 0 và nhỏ hơn 20");
            }
        } while (!ValidateFacility.validatePeople(numberPeople1));
        System.out.println("Nhâp loại thuê");
        String typeOfRent1;
        do {
            typeOfRent1 = sc.nextLine();
            if (!ValidateFacility.validateTypeOfRent(typeOfRent1)) {
                System.out.println("Phải viết hoa chữ cái đầu tiên trong mỗi từ");
            }
        } while (!ValidateFacility.validateTypeOfRent(typeOfRent1));
        System.out.println("Nhập dịch vụ miễn phí đi kèm");
        String freeService = sc.nextLine();
        Room room = new Room(id, name, usedArea1, rentCost1, numberPeople1, typeOfRent1, freeService);
        facilityRepository.add(room);
    }
}
