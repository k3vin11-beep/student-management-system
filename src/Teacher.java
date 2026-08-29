public class Teacher extends Person{
    Subject[]subjectTaught ;
    public Teacher(String name , int id , Subject[]subjectTaught){
        super(name, id);
        this.subjectTaught = subjectTaught;
    }
    public void viewClassPerformance(ClassGroup group) {
        System.out.println(name + "'s report for " + group.groupName + ":");
        for (Student student : group.students) {
            for (Score s : student.scores) {
                for (Subject taught : subjectTaught) {
                    if (s.subject == taught) {
                        System.out.println("  " + student.name + " - " + s.subject.name + ": " + s.mark);
                    }
                }
            }
        }
    }
}
