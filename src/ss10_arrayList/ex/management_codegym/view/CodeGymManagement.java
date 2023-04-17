package ss10_arrayList.ex.management_codegym.view;

import ss10_arrayList.ex.management_codegym.controller.StudentController;

public class CodeGymManagement {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}
