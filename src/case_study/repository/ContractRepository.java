package case_study.repository;

import case_study.model.Booking;
import case_study.model.ContractRent;

import java.util.*;

public class ContractRepository implements IContactRepository {
    private TreeSet<Booking> bookings = new TreeSet<>(Comparator.comparing(Booking::getDateBooking));
    private BookingRepository bookingRepository = new BookingRepository();
    private static List<ContractRent> list = new ArrayList<>();

    static {
        list.add(new ContractRent("1", "BK001", 12000, 15000));
        list.add(new ContractRent("2", "BK002", 15000, 18000));
        list.add(new ContractRent("3", "BK003", 20000, 21000));
    }

    @Override
    public void add(ContractRent contract) {
        list.add(contract);
    }

    @Override
    public List<ContractRent> getList() {
        return list;
    }

    @Override
    public int checkId(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdContract().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public TreeSet<Booking> getBookingList() {
        bookings = bookingRepository.getList();
        TreeSet<Booking> bookingTreeSet = new TreeSet<>(Comparator.comparing(Booking::getDateBooking));
        for (Booking s : bookings
        ) {
            bookingTreeSet.add(s);
        }
        return bookingTreeSet;
    }
}
