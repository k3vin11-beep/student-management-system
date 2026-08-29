public class Department {
    String departmentName ;
    Teacher[]teachers;
    ClassGroup[] classGroups ;
    HOD hod;

    public Department(String departmentName, Teacher[]teachers, ClassGroup[] classGroups, HOD hod){
        this.departmentName = departmentName;
        this.teachers = teachers;
        this.classGroups = classGroups;
        this.hod = hod;
    }
}
