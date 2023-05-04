package case_study.repository;

import case_study.model.Booking;

public interface IBookingRepository extends IRepository {
    void display();
    void add(Booking booking);
}
