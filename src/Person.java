public class Person {
    String name;
    int id;
    String password;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
        this.password = String.valueOf(id);
    }
    public void displayInfo(){
        System.out.println("name: "+ name + ", ID: "+id);
    }
    public boolean checkPassword(String attempt) {
        return this.password.equals(attempt);
    }
}
