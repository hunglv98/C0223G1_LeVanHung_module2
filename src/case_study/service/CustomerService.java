package case_study.service;

import case_study.model.*;
import case_study.model.person.Customer;
import case_study.repository.CustomerRepository;
import case_study.validate.ValidateCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showList() {
        List<Customer> list = customerRepository.getList();
        for (Customer e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        String id = null;
        do {
            System.out.println("Nhập vào id");
            id = sc.nextLine();
            if (!ValidateCustomer.validateId(id)) {
                System.out.println("Mời nhập lại");
            } else
                System.out.println("Nhập thành công");
        } while (!ValidateCustomer.validateId(id));
        String name = null;
        do {
            System.out.println("Nhập vào tên");
            name = sc.nextLine();
            if (!ValidateCustomer.validateName(name)) {
                System.out.println("Mời nhập lại");
            } else
                System.out.println("Nhập thành công");
        } while (!ValidateCustomer.validateName(name));
        String dateOfBirth = null;
        do {
            System.out.println("Nhập vào ngày sinh ");
            dateOfBirth = sc.nextLine();
            if (!ValidateCustomer.validDate(dateOfBirth)) {
                System.out.println("Mời nhập lại");
            } else System.out.println("Nhập thành công");
        } while (!ValidateCustomer.validDate(dateOfBirth));
        System.out.println("Nhập vào giới tính");
        String gender = sc.nextLine();
        String identifyNumber = null;
        do {
            System.out.println("Nhập vào CCCD");
            identifyNumber = sc.nextLine();
            if (!ValidateCustomer.validateIdentify(identifyNumber)) {
                System.out.println("Xin mời nhập lại");
            } else System.out.println("Nhập thành công");
        } while (!ValidateCustomer.validateIdentify(identifyNumber));
        String phoneNumber = null;
        do {
            System.out.println("Nhập vào số điện thoại");
            phoneNumber = sc.nextLine();
            if (!ValidateCustomer.validatePhoneNumber(phoneNumber)) {
                System.out.println("Mời nhập lại");
            } else System.out.println("Nhập thành công");
        }
        while (!ValidateCustomer.validatePhoneNumber(phoneNumber));
        System.out.println("Nhập vào email");
        String email = sc.nextLine();
        CustomerType customerType = null;
        boolean flag = true;
        do {
            System.out.println("Chọn kiểu khách hàng\n" +
                    "1. Diamond\n" +
                    "2. Platinum\n" +
                    "3. Gold\n" +
                    "4. Silver\n" +
                    "5. Member\n" +
                    "Mời bạn chọn");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    customerType = customerType.DIAMOND;
                    flag = false;
                    break;
                case 2:
                    customerType = customerType.PLATINUM;
                    flag = false;
                    break;
                case 3:
                    customerType = customerType.GOLD;
                    flag = false;
                    break;
                case 4:
                    customerType = customerType.SILVER;
                    flag = false;
                    break;
                case 5:
                    customerType = customerType.MEMBER;
                    flag = false;
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        } while (flag);
        System.out.println("Nhập vào địa chỉ");
        String address = sc.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, identifyNumber, phoneNumber, email, customerType, address);
        customerRepository.add(customer);
    }

    @Override
    public void edit() {
        List<Customer> list = customerRepository.getList();
        boolean flag3 = true;
        System.out.println("Nhập vào id muốn sửa");
        String id = sc.nextLine();
        int index = customerRepository.checkId(id);
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
                        "8. Kiểu khách hàng\n" +
                        "9. Địa chỉ\n" +
                        "10. Thoát\n");
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        String id1 = null;
                        do {
                            System.out.println("Nhập vào id cần sửa");
                            id1 = sc.nextLine();
                            if (!ValidateCustomer.validateId(id1)) {
                                System.out.println("Mời nhập lại");
                            } else
                                System.out.println("Nhập thành công");
                        } while (!ValidateCustomer.validateId(id1));
                        list.get(index).setId(id1);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 2:
                        String name = null;
                        do {
                            System.out.println("Nhập vào tên cần sửa");
                            name = sc.nextLine();
                            if (!ValidateCustomer.validateName(name)) {
                                System.out.println("Mời nhập lại");
                            } else
                                System.out.println("Nhập thành công");
                        } while (!ValidateCustomer.validateName(name));
                        list.get(index).setName(name);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 3:
                        String dateOfBirth = null;
                        do {
                            System.out.println("Nhập vào ngày sinh cần sửa ");
                            dateOfBirth = sc.nextLine();
                            if (!ValidateCustomer.validDate(dateOfBirth)) {
                                System.out.println("Mời nhập lại");
                            } else System.out.println("Nhập thành công");
                        } while (!ValidateCustomer.validDate(dateOfBirth));
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
                            if (!ValidateCustomer.validateIdentify(identifyNumber)) {
                                System.out.println("Xin mời nhập lại");
                            } else System.out.println("Nhập thành công");
                        } while (!ValidateCustomer.validateIdentify(identifyNumber));
                        list.get(index).setIdentifyNumber(identifyNumber);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 6:
                        String phoneNumber = null;
                        do {
                            System.out.println("Nhập vào số điện thoại cần sửa");
                            phoneNumber = sc.nextLine();
                            if (!ValidateCustomer.validatePhoneNumber(phoneNumber)) {
                                System.out.println("Mời nhập lại");
                            } else System.out.println("Nhập thành công");
                        }
                        while (!ValidateCustomer.validatePhoneNumber(phoneNumber));
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
                        CustomerType customerType = null;
                        boolean flag = true;
                        do {
                            System.out.println("Chọn kiểu khách hàng cần sửa\n" +
                                    "1. Diamond\n" +
                                    "2. Platinum\n" +
                                    "3. Gold\n" +
                                    "4. Silver\n" +
                                    "5. Member\n" +
                                    "Mời bạn chọn");
                            int input1 = Integer.parseInt(sc.nextLine());
                            switch (input1) {
                                case 1:
                                    customerType = customerType.DIAMOND;
                                    flag = false;
                                    break;
                                case 2:
                                    customerType = customerType.PLATINUM;
                                    flag = false;
                                    break;
                                case 3:
                                    customerType = customerType.GOLD;
                                    flag = false;
                                    break;
                                case 4:
                                    customerType = customerType.SILVER;
                                    flag = false;
                                    break;
                                case 5:
                                    customerType = customerType.MEMBER;
                                    flag = false;
                                    break;
                                default:
                                    System.out.println("Mời nhập lại");
                            }
                        } while (flag);
                        list.get(index).setCustomerType(customerType);
                        System.out.println("Cập nhật thành công");
                        break;
                    case 9:
                        System.out.println("Nhập vào địa chỉ cần sửa");
                        String address = sc.nextLine();
                        list.get(index).setAddress(address);
                        break;
                    case 10:
                        flag3 = false;
                        break;
                    default:
                        System.out.println("Mời bạn nhập lại");
                        break;
                }
            } while (flag3);
        customerRepository.edit(list);
    }

}
