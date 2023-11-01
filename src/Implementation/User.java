public class User {
    protected int ID;
    protected String name;
    protected int age;
    protected double hourlyRate;
    protected int completedHours;


    public User(int ID, String name, int age, double hourlyRate, int completedHours) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;
    }

    public double getSalary() {
        return hourlyRate * completedHours;
    }
}
