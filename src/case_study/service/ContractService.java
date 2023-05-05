package case_study.service;

import case_study.model.Booking;
import case_study.model.ContractRent;
import case_study.repository.BookingRepository;
import case_study.repository.ContractRepository;

import java.util.*;

public class ContractService implements IContactService {
    private static BookingRepository bookingRepository = new BookingRepository();
    private ContractRepository contractRepository = new ContractRepository();
    private TreeSet<Booking> set = contractRepository.getBookingList();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Đang tạo contract với booking đầu tiên");
        for (Booking n : set) {
            System.out.println(n);
        }
        System.out.println("Nhập vào id ");
        String idContract = sc.nextLine();
        String idBooking = set.pollFirst().getIdBooking();
        System.out.println("Nhập vào cọc trước");
        double deposit = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào tổng số tiền");
        double amount = Double.parseDouble(sc.nextLine());
        ContractRent contractRent = new ContractRent(idContract, idBooking, deposit, amount);
        contractRepository.add(contractRent);
    }

    @Override
    public void edit() {
        System.out.println("Nhập vào idContract");
        String idContract = sc.nextLine();
        int index = contractRepository.checkId(idContract);
        int input = -1;
        if (index == -1) {
            System.out.println("Không tồn tại id này");
        } else {
            System.out.println("Nhập vào thuộc tính cần sửa\n" +
                    "1. Deposit\n" +
                    "2. AmountOfContract");
            do {
                input = Integer.parseInt(sc.nextLine());
                if (input > 3) {
                    System.out.println("chỉ nhập 1 hoặc 2");
                }
            } while (input > 3);
        }
        switch (input) {
            case 1:
                System.out.println("Nhập vào deposit");
                double deposit = Double.parseDouble(sc.nextLine());
                contractRepository.getList().get(index).setDeposit(deposit);
                break;
            case 2:
                System.out.println("Nhập vào tổng hợp đồng");
                double amount = Double.parseDouble(sc.nextLine());
                contractRepository.getList().get(index).setAmountOfContract(amount);
                break;
            default:
                break;
        }
    }

    @Override
    public void showList() {
        List<ContractRent> list = contractRepository.getList();
        for (ContractRent c : list) {
            System.out.println(c);
        }
    }
}
