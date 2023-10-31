public class BudgetReportGenerator implements ReportGenerator {
    private User user;

    public BudgetReportGenerator(User user) {
        this.user = user;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Budget for User: ").append(user.name).append("\n");
        double totalBudget = user.getSalary();
        if (user instanceof Manager) {
            Manager manager = (Manager) user;
            for (Staff staff : manager.getStaffs()) {
                totalBudget += staff.getSalary();
            }
        } else if (user instanceof Director) {
            Director director = (Director) user;
            for (Manager manager : director.getManagers()) {
                totalBudget += manager.getSalary();
            }
            for (Staff staff : director.getStaffs()) {
                totalBudget += staff.getSalary();
            }
        }
        report.append("Total Budget: ").append(totalBudget);
        return report.toString();
    }
}
