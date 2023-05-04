package case_study.model;

import java.util.Date;

public class Booking {
    private String idBooking;
    private String dateBooking;
    private String date0fStart;
    private String dateOfEnd;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooking, String dateBooking, String date0fStart, String dateOfEnd, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.date0fStart = date0fStart;
        this.dateOfEnd = dateOfEnd;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDate0fStart() {
        return date0fStart;
    }

    public void setDate0fStart(String date0fStart) {
        this.date0fStart = date0fStart;
    }

    public String getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(String dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", date0fStart='" + date0fStart + '\'' +
                ", dateOfEnd='" + dateOfEnd + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
}
