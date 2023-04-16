package ss10_arrayList.ex.managementCodeGym.view;

import ss10_arrayList.ex.managementCodeGym.controller.StudentController;
import ss10_arrayList.ex.managementCodeGym.service.StudentService;

public class CodeGymManagement {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}
