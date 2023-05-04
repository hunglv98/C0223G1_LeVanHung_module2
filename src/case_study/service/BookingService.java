package case_study.service;

import case_study.model.Booking;
import case_study.model.person.Employee;
import case_study.repository.BookingRepository;
import case_study.repository.FacilityRepository;
import case_study.utils.ReadWriteEmployee;

import java.util.List;
import java.util.Scanner;

public class BookingService implements IBookingService {
    private BookingRepository bookingRepository = new BookingRepository();
    private List<Employee> list = ReadWriteEmployee.read();
    private FacilityRepository facilityRepository = new FacilityRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void showList() {
        bookingRepository.display();
    }

    @Override
    public void add() {
//         public Booking(String idBooking, String dateBooking, String date0fStart, String dateOfEnd, String idCustomer, String idService)
        System.out.println("Nhập vào mã booking");
        String idBooking = sc.nextLine();
        System.out.println("Nhập vào ngày booking");
        String dateBooking = sc.nextLine();
        System.out.println("Nhập vào ngày bắt đầu");
        String dateOfStart = sc.nextLine();
        System.out.println("Nhập vào ngày kết thúc");
        String dateOfEnd = sc.nextLine();
        System.out.println(list);
        System.out.print("Nhập vào id khách hàng ");
        String idCustomer;
        do {
            idCustomer = sc.nextLine();
            if (!checkIdCustomer(idCustomer)) {
                System.out.println("Không tồn tại ID này");
            }
        } while (!checkIdCustomer(idCustomer));
        facilityRepository.getList();
        System.out.print("Nhập vào id dịch vụ");
        String idService;
        do {
            idService = sc.nextLine();
            if (!facilityRepository.checkId(idService)) {
                System.out.println("Không tồn tại id dịch vụ này");
            }
        } while (!facilityRepository.checkId(idService));
        Booking booking = new Booking(idBooking, dateBooking, dateOfStart, dateOfEnd, idCustomer, idService);
        bookingRepository.add(booking);
        facilityRepository.updateBooking(idService);
    }

    public boolean checkIdCustomer(String id) {
        for (Employee e : list) {
            if (e.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
