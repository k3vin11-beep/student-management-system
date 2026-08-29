public class HOD extends Person{
    String department;
    public HOD(String name , int id,String department){
        super(name,id);
        this.department = department;


    }
    public void viewDepartmentPerformance(Department dept) {
        System.out.println(name + "'s report for " + dept.departmentName + ":");
        for (ClassGroup group : dept.classGroups) {
            for (Student student : group.students) {
                System.out.println("student: " + student.name);
                System.out.println("GPA: " + student.calculateGPA());
            }
        }

    }}
