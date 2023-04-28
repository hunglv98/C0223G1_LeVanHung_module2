package case_study.service;

import case_study.model.Academy;
import case_study.model.person.Employee;
import case_study.model.Position;
import case_study.repository.EmployeeRepository;
import case_study.validate.ValidateEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showList() {
        List<Employee> list = employeeRepository.getList();
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        String id = null;
        do {
            System.out.println("Nhập vào id");
            id = sc.nextLine();
            if (!ValidateEmployee.validateId(id)) {
                System.out.println("Mời nhập lại");
            } else
                System.out.println("Nhập thành công");
        } while (!ValidateEmployee.validateId(id));
        String name = null;
        do {
            System.out.println("Nhập vào tên");
            name = sc.nextLine();
            if (!ValidateEmployee.validateName(name)) {
                System.out.println("Mời nhập lại");
            } else
                System.out.println("Nhập thành công");
        } while (!ValidateEmployee.validateName(name));
        String dateOfBirth = null;
        do {
            System.out.println("Nhập vào ngày sinh ");
            dateOfBirth = sc.nextLine();
            if (!ValidateEmployee.validDate(dateOfBirth)) {
                System.out.println("Mời nhập lại");
            } else System.out.println("Nhập thành công");
        } while (!ValidateEmployee.validDate(dateOfBirth));
        System.out.println("Nhập vào giới tính");
        String gender = sc.nextLine();
        String identifyNumber = null;
        do {
            System.out.println("Nhập vào CCCD");
            identifyNumber = sc.nextLine();
            if (!ValidateEmployee.validateIdentify(identifyNumber)) {
                System.out.println("Xin mời nhập lại");
            } else System.out.println("Nhập thành công");
        } while (!ValidateEmployee.validateIdentify(identifyNumber));
        String phoneNumber = null;
        do {
            System.out.println("Nhập vào số điện thoại");
            phoneNumber = sc.nextLine();
            if (!ValidateEmployee.validatePhoneNumber(phoneNumber)) {
                System.out.println("Mời nhập lại");
            } else System.out.println("Nhập thành công");
        }
        while (!ValidateEmployee.validatePhoneNumber(phoneNumber));
        System.out.println("Nhập vào email");
        String email = sc.nextLine();
        Academy academy = null;
        boolean flag = true;
        do {
            System.out.println("Chọn học vấn\n" +
                    "1. Trung Cấp\n" +
                    "2. Cao Đẳng]n" +
                    "3. Đại học\n" +
                    "4. Sau đại học\n" +
                    "Mời bạn chọn");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    academy = Academy.TRUNGCAP;
                    flag = false;
                    break;
                case 2:
                    academy = Academy.CAODANG;
                    flag = false;
                    break;
                case 3:
                    academy = Academy.DAIHOC;
                    flag = false;
                    break;
                case 4:
                    academy = Academy.SAUDAIHOC;
                    flag = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        } while (flag);
        Position position = null;
        boolean flag1 = true;
        do {
            System.out.println("Chọn vị trí\n" +
                    "1. Lễ tân\n" +
                    "2. Phục vụ\n" +
                    "3. Chuyên viên\n" +
                    "4. Giám sát\n" +
                    "5. Quản lý\n" +
                    "6. Giám đốc\n" +
                    "Mời bạn chọn");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    position = Position.lễtân;
                    flag1 = false;
                    break;
                case 2:
                    position = Position.phụcvụ;
                    flag1 = false;
                    break;
                case 3:
                    position = Position.chuyênviên;
                    flag1 = false;
                    break;
                case 4:
                    position = Position.giámsát;
                    flag1 = false;
                    break;
                case 5:
                    position = Position.quảnlý;
                    flag1 = false;
                    break;
                case 6:
                    position = Position.giámđốc;
                    flag1 = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        } while (flag1);
        String wage = null;
        do {
            System.out.println("Nhập vào lương");
            wage = sc.nextLine();
            if (!ValidateEmployee.validateWage(wage)) {
                System.out.println("Mời nhập lại");
            } else
                System.out.println("Nhập thành công");
        } while (!ValidateEmployee.validateWage(wage));

        Employee employee = new Employee(id, name, dateOfBirth, gender, identifyNumber, phoneNumber, email, academy, position, wage);
        employeeRepository.add(employee);
    }

    @Override
    public void edit() {
        List<Employee> list = employeeRepository.getList();
        boolean flag3 = true;
        System.out.println("Nhập vào id muốn sửa");
        String id = sc.nextLine();
        int index = employeeRepository.checkId(id);
        if (index == -1) {
            System.out.println("không có id này");
        } else
            do {
                System.out.println("Nhập vào thông tin cần sửa\n" +
                        "1. ID\n" +
                        "2. Tên\n" +
                        "3. Ngày sinh\n" +
                        "4. Giới tính\n" +
                        "5. CCCD\n" +
                        "6. SDT\n" +
                        "7. Email\n" +
                        "8. Trình độ học vấn\n" +
                        "9. Vị trí\n" +
                        "10. Lương\n" +
                        "11. Thoát ");
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        String id1 = null;
                        do {
                            System.out.println("Nhập vào id cần sửa");
                            id1 = sc.nextLine();
                            if (!ValidateEmployee.validateId(id1)) {
                                System.out.println("Mời nhập lại");
                            } else
                                System.out.println("Nhập thành công");
                        } while (!ValidateEmployee.validateId(id1));
                        list.get(index).setId(id1);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 2:
                        String name = null;
                        do {
                            System.out.println("Nhập vào tên cần sửa");
                            name = sc.nextLine();
                            if (!ValidateEmployee.validateName(name)) {
                                System.out.println("Mời nhập lại");
                            } else
                                System.out.println("Nhập thành công");
                        } while (!ValidateEmployee.validateName(name));
                        list.get(index).setName(name);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 3:
                        String dateOfBirth = null;
                        do {
                            System.out.println("Nhập vào ngày sinh cần sửa ");
                            dateOfBirth = sc.nextLine();
                            if (!ValidateEmployee.validDate(dateOfBirth)) {
                                System.out.println("Mời nhập lại");
                            } else System.out.println("Nhập thành công");
                        } while (!ValidateEmployee.validDate(dateOfBirth));
                        list.get(index).setDateOfBirth(dateOfBirth);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 4:
                        System.out.println("Nhập vào giới tính cần sửa");
                        String gender = sc.nextLine();
                        list.get(index).setGender(gender);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 5:
                        String identifyNumber = null;
                        do {
                            System.out.println("Nhập vào CCCD cần sửa");
                            identifyNumber = sc.nextLine();
                            if (!ValidateEmployee.validateIdentify(identifyNumber)) {
                                System.out.println("Xin mời nhập lại");
                            } else System.out.println("Nhập thành công");
                        } while (!ValidateEmployee.validateIdentify(identifyNumber));
                        list.get(index).setIdentifyNumber(identifyNumber);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 6:
                        String phoneNumber = null;
                        do {
                            System.out.println("Nhập vào số điện thoại cần sửa");
                            phoneNumber = sc.nextLine();
                            if (!ValidateEmployee.validatePhoneNumber(phoneNumber)) {
                                System.out.println("Mời nhập lại");
                            } else System.out.println("Nhập thành công");
                        }
                        while (!ValidateEmployee.validatePhoneNumber(phoneNumber));
                        list.get(index).setPhoneNumber(phoneNumber);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 7:
                        System.out.println("Nhập vào email cần sửa");
                        String email = sc.nextLine();
                        list.get(index).setEmail(email);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 8:
                        Academy academy = null;
                        boolean flag = true;
                        do {
                            System.out.println("Chọn học vấn\n" +
                                    "1. Trung Cấp\n" +
                                    "2. Cao Đẳng]n" +
                                    "3. Đại học\n" +
                                    "4. Sau đại học\n" +
                                    "Mời bạn chọn");
                            int inputAcademy = Integer.parseInt(sc.nextLine());
                            switch (inputAcademy) {
                                case 1:
                                    academy = Academy.TRUNGCAP;
                                    flag = false;
                                    break;
                                case 2:
                                    academy = Academy.CAODANG;
                                    flag = false;
                                    break;
                                case 3:
                                    academy = Academy.DAIHOC;
                                    flag = false;
                                    break;
                                case 4:
                                    academy = Academy.SAUDAIHOC;
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("Mời nhập lại");
                            }
                        } while (flag);
                        list.get(index).setAcademy(academy);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 9:
                        Position position = null;
                        boolean flag1 = true;
                        do {
                            System.out.println("Chọn vị trí\n" +
                                    "1. Lễ tân\n" +
                                    "2. Phục vụ\n" +
                                    "3. Chuyên viên\n" +
                                    "4. Giám sát\n" +
                                    "5. Quản lý\n" +
                                    "6. Giám đốc\n" +
                                    "Mời bạn chọn");
                            int inputPosition = Integer.parseInt(sc.nextLine());
                            switch (inputPosition) {
                                case 1:
                                    position = Position.lễtân;
                                    flag1 = false;
                                    break;
                                case 2:
                                    position = Position.phụcvụ;
                                    flag1 = false;
                                    break;
                                case 3:
                                    position = Position.chuyênviên;
                                    flag1 = false;
                                    break;
                                case 4:
                                    position = Position.giámsát;
                                    flag1 = false;
                                    break;
                                case 5:
                                    position = Position.quảnlý;
                                    flag1 = false;
                                    break;
                                case 6:
                                    position = Position.giámđốc;
                                    flag1 = false;
                                    break;
                                default:
                                    System.out.println("Mời nhập lại");
                            }
                        } while (flag1);
                        list.get(index).setPosition(position);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 10:
                        String wage = null;
                        do {
                            System.out.println("Nhập vào lương cần sửa");
                            wage = sc.nextLine();
                            if (!ValidateEmployee.validateWage(wage)) {
                                System.out.println("Mời nhập lại");
                            } else
                                System.out.println("Nhập thành công");
                        } while (!ValidateEmployee.validateWage(wage));
                        list.get(index).setWage(wage);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 11:
                        flag3 = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại");
                        break;
                }
            } while (flag3);
        employeeRepository.edit(list);
    }
}

