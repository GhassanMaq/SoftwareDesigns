public class StaffReportGenerator implements ReportGenerator {
    private User user;

    public StaffReportGenerator(User user) {
        this.user = user;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Staff Report for User: ").append(user.name).append("\n");

        if (user instanceof Manager) {
            Manager manager = (Manager) user;
            manager.getStaffs().forEach(staff -> report.append(staff.name).append("\n"));
        } else if (user instanceof Director) {
            Director director = (Director) user;
            director.getManagers().forEach(manager -> report.append(manager.name).append("\n"));
            director.getStaffs().forEach(staff -> report.append(staff.name).append("\n"));
        }
        return report.toString();
    }
}

