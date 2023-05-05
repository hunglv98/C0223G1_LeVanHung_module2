package case_study.service;

import case_study.model.Booking;

import java.util.Comparator;

public class DateComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getDateBooking().compareTo(o2.getDateBooking());
    }
}
