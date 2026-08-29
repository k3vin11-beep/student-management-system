public class Student extends Person {
    String classGroup;
    Score[] scores;

    public Student(String name, int id , String classGroup , Score[] scores){
        super(name,id);
        this.classGroup = classGroup;
        this.scores = scores;
        }
    public void viewMyPerformance() {
        System.out.println(name + "'s performance:");
        for (Score s : scores) {
            System.out.println("  " + s.subject.name + ": " + s.mark);
        }
        System.out.println("GPA: " + calculateGPA());
    }
        public double calculateGPA() {
        int total = 0;
        int count = 0;
        for(Score s : scores){
            if(!s.subject.category.equals("Sport")){
                total += s.mark;
                count++;
            }
        }
        return (double)total /count;
    }

}
