package case_study.view;

import case_study.controller.FuramaController;
import case_study.repository.FacilityRepository;
import case_study.validate.ValidateEmployee;

public class FuramaManagement {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.showMainMenu();

    }
}
