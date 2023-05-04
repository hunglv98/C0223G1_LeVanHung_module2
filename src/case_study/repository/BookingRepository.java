package case_study.repository;

import case_study.model.Booking;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private static TreeSet<Booking> set = new TreeSet<>(Comparator.comparing(Booking::getDate0fStart).thenComparing(Booking::getDateOfEnd));
    static {
//        public Booking(String idBooking, Date dateBooking, Date date0fStart, Date dateOfEnd, String idCustomer, String idService)
        set.add(new Booking("1","22-12-2023","22-12-2023","23-12-2023","KH-1234","SVVL-1234"));
        set.add(new Booking("2","21-12-2023","21-12-2023","23-12-2023","KH-1234","SVVL-1234"));
        set.add(new Booking("3","22-12-2023","22-12-2023","25-12-2023","KH-1234","SVVL-1234"));
    }
    @Override
    public void display() {
        for (Booking b:set) {
            System.out.println(b);
        }
    }

    @Override
    public void add(Booking booking) {
        set.add(booking);
    }

}
