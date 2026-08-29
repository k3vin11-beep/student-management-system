public class Principal extends Person {
    public Principal(String name , int id){
        super(name , id);
    }
    // inside Principal.java
    public void viewSchoolPerformance(Department[] allDepartments) {
        for (Department dept : allDepartments) {
            System.out.println("Department: " + dept.departmentName + " (HOD: " + dept.hod.name + ")");
            for (ClassGroup group : dept.classGroups) {
                for (Student student : group.students){
                        System.out.println("  " + student.name + " - GPA: " + student.calculateGPA());
                    }
                }
            }
    }
}
