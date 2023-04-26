package case_study.view;

import case_study.controller.FuramaController;
import case_study.model.Academy;
import case_study.model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FuramaManagement {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.showMainMenu();
    }
}
