package ss10_arrayList.ex.management_codegym.repository;

import ss10_arrayList.ex.management_codegym.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
//    public Teacher(String id, String name, String dateOfBirth, String gender, String speciality) {
    public static ArrayList<Teacher> teacherList = new ArrayList<>();
    static{
        teacherList.add(new Teacher("1","Hoa","20/05/2000","Nữ","Hóa"));
        teacherList.add(new Teacher("2","Hòa","1/05/2000","Nam","Toán"));
        teacherList.add(new Teacher("3","Hợp","26/05/2000","Nữ","Ngữ Văn"));
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    @Override
    public void addTeacherList(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public boolean checkTeacherById(String id) {
        for (Teacher t: teacherList) {
            if(t.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteTeacher(String id) {
        for (Teacher t : teacherList) {
            if(t.getId().equals(id)){
                teacherList.remove(t);
                System.out.println("Xóa thành công");
                break;
            }
        }
    }

}
