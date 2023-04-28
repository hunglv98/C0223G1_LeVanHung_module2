package case_study.controller;

import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.repository.FacilityRepository;
import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    private FacilityService facilityService = new FacilityService();
    public void showFacilityMenu() {
        FuramaController furamaController = new FuramaController();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("-----Facility Management-----\n" +
                    "1. Display list facilities \n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance \n" +
                    "4. Return main menu\n" +
                    "Enter your choice: ");
            int input = -1;
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input < 0 || input > 4) {
                    throw new Exception("Nhập từ 1-4");
                }
            } catch (NumberFormatException n) {
                System.out.println("Chỉ nhập số");
            } catch (Exception e) {
                System.out.println(e);
            }
            switch (input) {
                case 1:
                    facilityService.showList();
                    break;
                case 2:
                    boolean flag = true;
                    do{
                        System.out.println("Nhập vào dịch vụ muốn thêm\n" +
                                "1. Add New Villa\n" +
                                "2. Add New House\n" +
                                "3. Add New Room\n" +
                                "4. Back to Menu");
                        int input1 = Integer.parseInt(sc.nextLine());
                        switch (input1){
                            case 1:
//                                public Villa(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String standardRoom, double poolArea, int numberFloor)
                                System.out.println("Cho nhập id");
                                String id = sc.nextLine();
                                System.out.println("Nhập tên");
                                String name = sc.nextLine();
                                System.out.println("Số tiền thuê");
                                double usedArea = Double.parseDouble(sc.nextLine());
                                System.out.println("Nhập số người");
                                double rentCost = Double.parseDouble(sc.nextLine()) ;
                                System.out.println("Nhập diện tích sử dụng");
                                int numberPeople = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhâp loại thuê");
                                String typeOfRent = sc.nextLine();
                                System.out.println("Nhập loại phòng");
                                String standard = sc.nextLine();
                                System.out.println("Nhập diện tích hồ bơi");
                                double poolArea = Double.parseDouble(sc.nextLine());
                                System.out.println("Nhập số tầng");
                                int numberFloor = Integer.parseInt(sc.nextLine());
                                Villa villa = new Villa(id,name,usedArea,rentCost,numberPeople,typeOfRent,standard,poolArea,numberFloor);
                                facilityService.add(villa,id);
                                break;
                            case 2:
//                                public House(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String standardRoom, int numberFloor)
                                System.out.println("Cho nhập id");
                                String id1 = sc.nextLine();
                                System.out.println("Nhập tên");
                                String name1 = sc.nextLine();
                                System.out.println("Nhập diện tích sử dụng");
                                double usedArea1 = Double.parseDouble(sc.nextLine());
                                System.out.println("Số tiền thuê");
                                double rentCost1 = Double.parseDouble(sc.nextLine()) ;
                                System.out.println("Nhập số người");
                                int numberPeople1 = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhâp loại thuê");
                                String typeOfRent1 = sc.nextLine();
                                System.out.println("Nhập tiêu chuẩn phòng");
                                String standardRoom = sc.nextLine();
                                System.out.println("Nhập số tầng");
                                int numberFloor1 = Integer.parseInt(sc.nextLine());
                                House house = new House(id1,name1,usedArea1,rentCost1,numberPeople1,typeOfRent1,standardRoom,numberFloor1);
                                facilityService.add(house,id1);
                                break;
                            case 3:
//                                public Room(String id, String name, double usedArea, double rentCost, int numberPeople, String typeOfRent, String freeService)
                                System.out.println("Cho nhập id");
                                String id2 = sc.nextLine();
                                System.out.println("Nhập tên");
                                String name2 = sc.nextLine();
                                System.out.println("Nhập diện tích sử dụng");
                                double usedArea2 = Double.parseDouble(sc.nextLine());
                                System.out.println("Số tiền thuê");
                                double rentCost2 = Double.parseDouble(sc.nextLine()) ;
                                System.out.println("Nhập số người");
                                int numberPeople2 = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhâp loại thuê");
                                String typeOfRent2 = sc.nextLine();
                                System.out.println("Nhập dịch vụ miễn phí đi kèm");
                                String freeService = sc.nextLine();
                                Room room = new Room(id2,name2,usedArea2,rentCost2,numberPeople2,typeOfRent2,freeService);
                                facilityService.add(room,id2);
                                break;
                            case 4:
                                flag = false;
                                break;
                            default:
                                break;
                        }
                    }while (flag);
                    break;
                case 3:
                    facilityService.showMaintainList();
                    break;
                case 4:
                    furamaController.showMainMenu();
                default:
                    break;
            }
        } while (true);
    }
}
