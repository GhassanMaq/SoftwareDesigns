import java.util.List;

public class Director extends User {
    protected List<Manager> managers;
    protected List<Staff> staffs;

    public Director(int ID, String name, int age, double hourlyRate, int completedHours, List<Staff> staffs, List<Manager> managers) {
        super(ID, name, age, hourlyRate, completedHours);
        this.staffs = staffs;
        this.managers = managers;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }
}
