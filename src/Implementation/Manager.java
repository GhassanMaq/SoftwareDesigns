import java.util.List;

public class Manager extends User {
    protected List<Staff> staffs;

    public Manager(int ID, String name, int age, double hourlyRate, int completedHours, List<Staff> staffs) {
        super(ID, name, age, hourlyRate, completedHours);
        this.staffs = staffs;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }
}
