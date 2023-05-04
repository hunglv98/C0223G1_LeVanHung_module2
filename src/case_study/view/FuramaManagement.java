package case_study.view;

import case_study.controller.FuramaController;
import case_study.repository.BookingRepository;

public class FuramaManagement {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.showMainMenu();
    }
}
